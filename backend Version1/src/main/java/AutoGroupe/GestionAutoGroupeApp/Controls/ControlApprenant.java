package AutoGroupe.GestionAutoGroupeApp.Controls;

import AutoGroupe.GestionAutoGroupeApp.Enummer.Etat;
import AutoGroupe.GestionAutoGroupeApp.Models.Apprenant;
import AutoGroupe.GestionAutoGroupeApp.Services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping(path = "/AutoGestioGroup")
@CrossOrigin("*")
public class ControlApprenant {
    @Autowired
    ApprenantService apprenantService;
    //ajouter apprenant
    @PostMapping("/AddApp")
    public Apprenant addApprenant(@RequestBody Apprenant apprenant) {

        return apprenantService.addApprenant(apprenant);
    }
    //modifier apprenant
    @PutMapping(value = "/updatApp/{id}")
    public Apprenant updateApp(@RequestBody Apprenant apprenant, @PathVariable("id") Long id) {
      return apprenantService.updateApp(apprenant,id);
    }
    //liste Apprenant
    @GetMapping(value = "/ListApp")
    @ResponseBody
    public List<Apprenant> listeApp(Etat etat) {
        return apprenantService.listeApp(etat);
    }
    //supprimer apprenant
    @DeleteMapping(value = "/DeleteApp/{id}")
    @ResponseBody
    public void deleteApp(@PathVariable("id") Long id) {
        apprenantService.deleteApp(id);
    }
    @GetMapping("/count")
    @ResponseBody
    public long countApprenant() {
        return apprenantService.getCountOfApprenant();

    }
    @GetMapping("/app/{id}")
    public Apprenant recupereApprenantParSonId(Etat etat, @PathVariable("id")long id) {
        return apprenantService.findByIdAndEtat(id,etat);
    }
    @DeleteMapping("/restaurer/{id}")
    @ResponseBody
    public void restaurerCorbeile(@PathVariable("id") long id) {
        apprenantService.restaurerCorbeile(id);
    }
   //trier apprenant par ordre croissant



}
