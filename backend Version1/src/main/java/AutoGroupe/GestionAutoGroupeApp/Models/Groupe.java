package AutoGroupe.GestionAutoGroupeApp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Groupe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numgroupe;
    private String libelle;

    @ManyToOne
    @JoinColumn(name = "apprenant_id")
    private Apprenant apprenant;

}
