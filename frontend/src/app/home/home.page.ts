import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  segment:String="liste";
  eventSeg: any;
  constructor() {}

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

}
