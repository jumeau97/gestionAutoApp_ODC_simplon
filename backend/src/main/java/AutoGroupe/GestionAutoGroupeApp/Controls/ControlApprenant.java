package AutoGroupe.GestionAutoGroupeApp.Controls;

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
    public List<Apprenant> listeApp() {
        return apprenantService.listeApp();
    }
    //supprimer apprenant
    @DeleteMapping(value = "/DeleteApp/{id}")
    @ResponseBody
    public void deleteApp(@PathVariable("id") Long id) {
        apprenantService.deleteApp(id);
    }
    @RequestMapping(value = "/count")
    @ResponseBody
    public long countApprenant() {
        long count = apprenantService.getCountOfApprenant();
        return count;
    }
    @GetMapping("/app/{id}")
    public Apprenant recupereApprenantParSonId(@PathVariable("id")long id) {
        return apprenantService.recupererApprenantParSonId(id);
    }


}
