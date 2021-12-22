import { Component, OnInit } from '@angular/core';
import { AccueilService } from '../services/accueil.service';

@Component({
  selector: 'app-formulaire',
  templateUrl: './formulaire.page.html',
  styleUrls: ['./formulaire.page.scss'],
})
export class FormulairePage implements OnInit {

  constructor(private appServ:AccueilService) { }

  ngOnInit() {
  }
  createApp(data:any){
    console.log("apprenant", data.value);
    this.appServ.saveApp(data.value).subscribe((donnee:any)=>{
      console.log("les données", donnee);
      
    });
    
  }

}
