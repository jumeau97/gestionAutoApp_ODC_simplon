package AutoGroupe.GestionAutoGroupeApp.Repository;

import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RepositoryGroupe extends JpaRepository<Groupe,Long> {

    @Query("SELECT g FROM Groupe g WHERE g.libelle=:lib")
    List<Groupe> findByLib(@Param(value = "lib") String lib);
}
