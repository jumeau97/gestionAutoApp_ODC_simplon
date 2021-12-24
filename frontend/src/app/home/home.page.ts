import { Component } from '@angular/core';
import { PopoverController } from '@ionic/angular';
import { PopoverComponent } from '../popover/popover.component';
import { AccueilService } from '../services/accueil.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  segment:String="liste";
  eventSeg: any;
  listApp: any;
  maListe: any;
  groupe: any[] = [];
  lByLib: any;
  constructor(private accueilServ: AccueilService, public popoverController: PopoverController) {
    this.AllApprenant();
    this.listGroup();
  }

  segmentChanged(event:any){
    console.log("event",event.target.value);
    this.eventSeg=event.target.value;
    if(this.eventSeg=="details"){
      this.segment="details";
    }
    else if(this.eventSeg=="groupe"){
      this.segment="groupe";
    }else{
      this.segment="liste";
    }

  }

  // La liste des apprenants
  AllApprenant(){
    this.accueilServ.getAllApp().subscribe((data:any)=>{
      console.log("liste des apprenants",data);
      this.listApp=data;
    })
  }

  unread(){
    console.log("bonjour");
    
  }

  //supprimer un apprenannt
  deleteApprenant(raw:any){
    console.log(raw);
    this.accueilServ.deleteApp(raw.id)
    .subscribe(res=>{
      alert(" voulez vous supprimer")
      this.AllApprenant();
    })
  }

  listGroup()
{
  this.accueilServ.listGroup().subscribe((data:any)=>{
    console.log('list', data);
     this.maListe=data;
    if (this.maListe.length > 0) {
      this.maListe.forEach(elt => {
        const indexMar = this.groupe.findIndex(id => id.libelle === elt.libelle);
        console.log("index", indexMar);
        
        if (indexMar > -1) {
          console.log('ca existe ');

        } else {
          this.groupe.push({
            libelle: elt.libelle,
        
          })
        }
      });
      console.log('market', this.groupe)

      // this.getAllPlaceByMarketAndUser(this.market[this.indexEntity].id);
    }
    
  });
}


async groupSelect(group:any){
  console.log(group);
  this.accueilServ.groupByLibelle(group.libelle).subscribe((data:any)=>{
    console.log("liste par libelle", data);
    this.lByLib=data;
    this.accueilServ.setGroup(this.lByLib);
  });

  const popover = await this.popoverController.create({
    component: PopoverComponent,
    cssClass: 'my-custom-class',
    event: this.lByLib,
    translucent: true
  });
  await popover.present();

  const { role } = await popover.onDidDismiss();
  console.log('onDidDismiss resolved with role', role);
}
  

}
