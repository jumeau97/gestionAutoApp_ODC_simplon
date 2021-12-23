package AutoGroupe.GestionAutoGroupeApp.Models.Payloads;

import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;

import java.util.List;

public class Affectation {
    List<Groupe> groupes;

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }
}
