package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupeService {
    public Groupe addGroupe(Groupe groupe);
    public Groupe updateGroupe(Groupe groupe,Long id);
    public List<Groupe>lisGroupe();
    public  void deleteGroupe(long id);
    public Groupe recupererGroupParSonId(long id);
}
