package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import AutoGroupe.GestionAutoGroupeApp.Repository.RepositoryGroupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeServiceImple implements GroupeService{
    @Autowired
    RepositoryGroupe repositoryGroupe;
    @Override
    public Groupe addGroupe(Groupe groupe) {
        return repositoryGroupe.save(groupe);
    }

    @Override
    public Groupe updateGroupe(Groupe groupe, Long id) {
        Groupe modiGroup=repositoryGroupe.getById(id);
        modiGroup.setNumgroupe(groupe.getNumgroupe());
        return repositoryGroupe.save(modiGroup) ;
    }

    @Override
    public List<Groupe> lisGroupe() {
        return repositoryGroupe.findAll();
    }

    @Override
    public void deleteGroupe(long id) {
        repositoryGroupe.deleteById(id);

    }

    @Override
    public Groupe recupererGroupParSonId(long id) {

        return repositoryGroupe.findById(id).get();
    }
}
