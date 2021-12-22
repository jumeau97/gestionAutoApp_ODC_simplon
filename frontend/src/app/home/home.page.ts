import { Component } from '@angular/core';
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
  constructor(private accueilServ: AccueilService) {
    this.AllApprenant();
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

}
