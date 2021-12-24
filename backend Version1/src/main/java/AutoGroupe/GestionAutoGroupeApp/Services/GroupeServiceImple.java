package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import AutoGroupe.GestionAutoGroupeApp.Models.Payloads.Affectation;
import AutoGroupe.GestionAutoGroupeApp.Repository.RepositoryApprenant;
import AutoGroupe.GestionAutoGroupeApp.Repository.RepositoryGroupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class GroupeServiceImple implements GroupeService{
    @Autowired
    RepositoryGroupe repositoryGroupe;
    @Autowired
    RepositoryApprenant repositoryApprenant;
    @Override
    public void addGroupe(List<Groupe> aff) {
       // List<Groupe> list= new ArrayList<>();
        for(int i=0; i<aff.size(); i++){

            Groupe group= new Groupe();
            group.setLibelle(aff.get(i).getLibelle());
            group.setApprenant(aff.get(i).getApprenant());
            repositoryGroupe.save(group);
        }

    }

    @Override
    public Groupe updateGroupe(Groupe groupe, Long id) {
        Groupe modiGroup=repositoryGroupe.getById(id);
        modiGroup.setNumgroupe(groupe.getNumgroupe());
        modiGroup.setLibelle(groupe.getLibelle());
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

    @Override
    public List<Groupe> listGroupeLib(String lib) {
        return repositoryGroupe.findByLib(lib);
    }
}

