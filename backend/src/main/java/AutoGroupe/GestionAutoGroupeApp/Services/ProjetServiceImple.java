package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Projet;
import AutoGroupe.GestionAutoGroupeApp.Repository.RepositoryProjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImple implements ProjetService {
    @Autowired
    RepositoryProjet repositoryProjet;
    @Override
    public Projet addProjet(Projet projet) {

        return repositoryProjet.save(projet);
    }

    @Override
    public List<Projet> listProjet() {

        return repositoryProjet.findAll();
    }

    @Override
    public Projet updateProjet(Projet projet, long id) {
        Projet modiProjet=repositoryProjet.getById(id);
        modiProjet.setLibelle(projet.getLibelle());

        return repositoryProjet.save(modiProjet);
    }

    @Override
    public void deletProjet(long id) {
        repositoryProjet.deleteById(id);

    }
    @Override
    public Projet ProjetById(long id) {
        return repositoryProjet.getById(id);
    }
}
