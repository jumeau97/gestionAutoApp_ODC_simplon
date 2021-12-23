package AutoGroupe.GestionAutoGroupeApp.Repository;

import AutoGroupe.GestionAutoGroupeApp.Models.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryProjet extends JpaRepository<Projet,Long> {
}
