import { Component, OnInit } from '@angular/core';
import { AccueilService } from '../services/accueil.service';
@Component({
  selector: 'app-recherche',
  templateUrl: './recherche.page.html',
  styleUrls: ['./recherche.page.scss'],
})
export class RecherchePage {
  segment:String="liste";
  eventSeg: any;
  listApp: any;
  recherche: any;
  constructor(private accueilServ: AccueilService) {
    this.AllApprenant();
   }

   AllApprenant(){
    this.accueilServ.getAllApp().subscribe((data:any)=>{
      console.log("liste des apprenants",data);
      this.listApp=data;
    })
  }

  search(){
    const searchbar = document.querySelector('ion-searchbar');
      const items = Array.from(document.querySelector('ion-list').children);

      searchbar.addEventListener('ionInput', handleInput);

      function handleInput(event) {
        const query = event.target.value.toLowerCase();
        requestAnimationFrame(() => {
          items.forEach((item) => {
            const shouldShow = item.textContent.toLowerCase().indexOf(query) > -1;
            // item.style.display = shouldShow ? 'block' : 'none';
          });
        });
      }
  }

}
