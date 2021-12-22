import { Component, OnInit } from '@angular/core';
import { ToastController } from '@ionic/angular';
import { AccueilService } from '../services/accueil.service';

@Component({
  selector: 'app-formulaire',
  templateUrl: './formulaire.page.html',
  styleUrls: ['./formulaire.page.scss'],
})
export class FormulairePage implements OnInit {

  constructor(
    private appServ:AccueilService,
    private toastController:ToastController
    ) { }

  ngOnInit() {
  }
  createApp(data:any){
    console.log("apprenant", data.value);
    this.appServ.saveApp(data.value).subscribe((donnee:any)=>{
      console.log("les données", donnee);
      
    });
      this.presentToast();
  
  }

  async presentToast() {
    const toast = await this.toastController.create({
      message: 'Apprenant ajouté avec succès',
      duration: 2000
    });
    toast.present();
  }

}
