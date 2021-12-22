package AutoGroupe.GestionAutoGroupeApp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Affecter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date dateaff;
    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;

    @ManyToOne
    @JoinColumn(name = "apprenant_id")
    private Apprenant apprenant;



}
