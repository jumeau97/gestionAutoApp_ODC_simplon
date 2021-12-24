package AutoGroupe.GestionAutoGroupeApp.Controls;

import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import AutoGroupe.GestionAutoGroupeApp.Models.Groupe;
import AutoGroupe.GestionAutoGroupeApp.Models.Payloads.Affectation;
import AutoGroupe.GestionAutoGroupeApp.Services.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/AutoGestioGroup")
@CrossOrigin("*")
public class ControlGoupe {
    @Autowired
    GroupeService groupeService;

    @PostMapping(value = "/AddGroup")
    public void addGroupe(@RequestBody List<Groupe> groupe) {
        System.out.println(groupe);
          groupeService.addGroupe(groupe);
    }
    //modifier Groupe
    @PutMapping(value = "/updatGroupe/{id}")
    public Groupe updateGroupe(@RequestBody Groupe groupe, @PathVariable("id") Long id) {
        return groupeService.updateGroupe(groupe,id);
    }
    //liste Groupe
    @GetMapping(value = "/ListGroup")
    @ResponseBody
    public List<Groupe> lisGroupe() {
        return groupeService.lisGroupe();
    }
    //supprimer Groupe
    @DeleteMapping(value = "/DeleteGroupe/{id}")
    @ResponseBody
    public void deleteGroupe(@PathVariable("id") long id) {
        groupeService.deleteGroupe(id);
    }
    //recupérer le groupe par son id
    @GetMapping("/group/{id}")
    @ResponseBody
    public Groupe recupererGroupParSonId(@PathVariable("id") long id) {

        return groupeService.recupererGroupParSonId(id);
    }

    @GetMapping("/lib/{key}")
    public List<Groupe> listByLib(@RequestBody @PathVariable(value = "key") String key){
        //System.out.println(key);
        return groupeService.listGroupeLib(key);
    }




}
