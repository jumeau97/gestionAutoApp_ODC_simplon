package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApprenantService  {
    public Apprenant addApprenant(Apprenant apprenant);
    public Apprenant updateApp(Apprenant apprenant,Long id);
    public void deleteApp(Long id);
    public List<Apprenant> listeApp();
    public Apprenant recupererApprenantParSonId(long id);
    public long getCountOfApprenant();

}
