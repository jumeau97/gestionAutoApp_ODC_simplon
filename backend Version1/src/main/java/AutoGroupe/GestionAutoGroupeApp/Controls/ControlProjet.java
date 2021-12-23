/*package AutoGroupe.GestionAutoGroupeApp.Controls;

import AutoGroupe.GestionAutoGroupeApp.Models.Projet;
import AutoGroupe.GestionAutoGroupeApp.Services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/AutoGestioGroup")
@CrossOrigin("*")
public class ControlProjet {
    @Autowired
    ProjetService projetService;
    @PostMapping("/AddProjet")
    @ResponseBody
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.addProjet(projet);

    }
    @GetMapping("/ListProjet")
    @ResponseBody
    public List<Projet> listProjet() {
        return projetService.listProjet();
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    public Projet updateProjet(@RequestBody Projet projet,@PathVariable("id") long id) {
        return projetService.updateProjet(projet,id);
    }
    @DeleteMapping("/DeletProjet/{id}")
    @ResponseBody
    public void deletProjet(@PathVariable("id") long id) {
        projetService.deletProjet(id);
    }
    @GetMapping("/GetProjet/{id}")
    public Projet getByIdProjet(@PathVariable("id") long id) {
        return projetService.ProjetById(id);
    }
}
*/