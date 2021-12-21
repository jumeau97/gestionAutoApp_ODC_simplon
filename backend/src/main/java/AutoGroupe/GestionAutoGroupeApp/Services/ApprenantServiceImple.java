package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import AutoGroupe.GestionAutoGroupeApp.Repository.RepositoryApprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
     repositoryApprenant.deleteById(id);
    }

    @Override
    public List<Apprenant> listeApp() {
        return repositoryApprenant.findAll();
    }

    @Override
    public Apprenant recupererApprenantParSonId(long id) {
        return repositoryApprenant.findById(id).get();
    }

    @Override
    public long getCountOfApprenant() {
        long count= repositoryApprenant.count();
        return count;
    }

}
