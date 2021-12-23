package AutoGroupe.GestionAutoGroupeApp.Services;

import AutoGroupe.GestionAutoGroupeApp.Models.Projet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjetService  {
    public Projet addProjet(Projet projet);
    public List<Projet> listProjet();
    public Projet updateProjet(Projet projet,long id);
    public void deletProjet(long id);
    public Projet ProjetById(long id);
}
