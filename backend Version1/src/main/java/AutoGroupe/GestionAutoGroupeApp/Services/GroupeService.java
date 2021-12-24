package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import AutoGroupe.GestionAutoGroupeApp.Models.Payloads.Affectation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupeService {
    public void addGroupe(List<Groupe> groupe);
    public Groupe updateGroupe(Groupe groupe,Long id);
    public List<Groupe>lisGroupe();
    public  void deleteGroupe(long id);
    public Groupe recupererGroupParSonId(long id);
    //public void save2(List<Apprenant> apprenants);
    public List<Groupe>listGroupeLib(String lib);


}
