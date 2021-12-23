import { Component, OnInit } from '@angular/core';
import { AffecterAppGroupe } from '../model/AffecterAppGroupe';

@Component({
  selector: 'app-formulaire-groupe',
  templateUrl: './formulaire-groupe.page.html',
  styleUrls: ['./formulaire-groupe.page.scss'],
})
export class FormulaireGroupePage implements OnInit {
  nbreGroup: any;
  listApp: any[];
  groupe:[]=[];
  groupes: any;
  newGroupe:any[]=[];
  //  affectation: AffecterAppGroupe = new AffecterAppGroupe();
  affectation: any[]=[];
  constructor() { }

  ngOnInit() {
  }

  createGroup(data:any){
    this.affectation=[];
    console.log("Création du groupe", data.value);
    this.nbreGroup=data.value.nbreGroupe;
    const listeComplet=10;
    this.listApp=[
      {nom_complet:"Alassane SANOGO", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Awa KEITA", email:"awa@gmail.com", telephone:"telephone"},
      {nom_complet:"Mamoutou BAGAYOGO", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Modibo SANGARE", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Ibrahima KONATE", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Mamadou TRAORE", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Seydou AFFOGNON", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Ibrahim KELLY", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Adama COULIBALY", email:"alass@gmail.com", telephone:"telephone"},
      {nom_complet:"Abdoulaye DIARRA", email:"alass@gmail.com", telephone:"telephone"},
      
    ];

    // tableau de groupe
    this.groupes=
    [
      {id:1,numgoupe:1},
      {id:2,numgoupe:2},
      {id:3,numgoupe:3},
      {id:4,numgoupe:4},
      {id:5,numgoupe:5},

    ];

   const values=this.listApp;
   const sums=this.nbreGroup;
   let person = this.listApp;
    
   let random = person.sort(() => Math.random() - 0.5);
   console.log(random);

   function chunk(array, size){
      if(array.length <= size){
        return[array];
      }
      return [array.slice(0, size), ...chunk(array.slice(size),size)]
   }

   var team= chunk(random, sums);

   for (let i = 0; i < team.length; i++) {
    // output.innerHTML += `<p> Team-${i + 1}: ${team[i]} </p>`;
    // console.log("Groupe",i+1,team[i] );
    for(let j= 0; j< team[i].length; j++){
      // console.log("groupe",i+1,team[i][j]);
      
      this.affectation.push({
        group:i+1,
        apprenant:team[i][j]
      });
    }   
  }

  console.log("affectation", this.affectation);

  // =============================================================================
 

   
    
  }



}
