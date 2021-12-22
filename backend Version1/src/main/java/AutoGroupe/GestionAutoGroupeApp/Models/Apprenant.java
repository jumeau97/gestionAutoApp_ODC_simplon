package AutoGroupe.GestionAutoGroupeApp.Models;

import AutoGroupe.GestionAutoGroupeApp.Enummer.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apprenant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom_complet;
    private String email;
    private String telephone;
    @Enumerated(EnumType.STRING)
    private Etat etat=Etat.actif;



}
