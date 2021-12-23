package AutoGroupe.GestionAutoGroupeApp.Repository;

import AutoGroupe.GestionAutoGroupeApp.Enummer.Etat;
import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RepositoryRestResource
@CrossOrigin("*")
public interface RepositoryApprenant extends JpaRepository<Apprenant,Long> {
    @Transactional
    @Modifying
    @Query("UPDATE Apprenant  SET etat='inactif' WHERE id=:id")
    void changerEtatApp(@Param(value = "id") long id);
    List<Apprenant> findByEtat(Etat etat);
    // afficher un apprenant par son id
    Apprenant findByIdAndEtat(long id,Etat etat);
    //recuperer le corbeile
    @Transactional
    @Modifying
    @Query("UPDATE Apprenant SET etat='actif' WHERE id=:id")
    void restaurerCorbeile(@Param(value = "id")long id);

    @Query("SELECT count(*) FROM Apprenant WHERE etat='actif'")
    long findByApprenatEtat();
    //trie





}
