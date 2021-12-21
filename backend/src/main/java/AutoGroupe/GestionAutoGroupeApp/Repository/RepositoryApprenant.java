package AutoGroupe.GestionAutoGroupeApp.Repository;

import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryApprenant extends JpaRepository<Apprenant,Long> {
}
