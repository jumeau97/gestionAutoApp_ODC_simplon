package AutoGroupe.GestionAutoGroupeApp.Repository;

import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryGroupe extends JpaRepository<Groupe,Long> {
}
