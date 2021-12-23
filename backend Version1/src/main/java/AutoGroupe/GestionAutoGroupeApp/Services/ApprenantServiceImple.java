package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Enummer.Etat;
import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import AutoGroupe.GestionAutoGroupeApp.Repository.RepositoryApprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.ASC;

@Service

public class ApprenantServiceImple implements ApprenantService{
    @Autowired
    RepositoryApprenant repositoryApprenant;
    @Override
    public Apprenant addApprenant(Apprenant apprenant) {
       return repositoryApprenant.save(apprenant);
    }

    @Override
    public Apprenant updateApp(Apprenant apprenant, Long id) {
       Apprenant modiapp = repositoryApprenant.findById(id).get();
        modiapp.setNom_complet(apprenant.getNom_complet());
        modiapp.setEmail(apprenant.getEmail());
        modiapp.setTelephone(apprenant.getTelephone());
       System.out.println("Voici objet reecupere"+modiapp);
        return repositoryApprenant.save(modiapp) ;
    }

    @Override
     public void deleteApp(Long id) {
     repositoryApprenant.changerEtatApp(id);
    }

    @Override
    public List<Apprenant> listeApp(Etat etat) {
        return repositoryApprenant.findByEtat(Etat.actif);
    }

    @Override
    public Apprenant findByIdAndEtat(long id,Etat etat) {
        return repositoryApprenant.findByIdAndEtat(id,Etat.actif);
    }

    @Override
    public long getCountOfApprenant() {
         return repositoryApprenant.findByApprenatEtat();

    }

    @Override
    public void restaurerCorbeile(long id) {
        repositoryApprenant.restaurerCorbeile(id);
    }



}
