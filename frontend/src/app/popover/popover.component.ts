import { Component, OnInit } from '@angular/core';
import { AccueilService } from '../services/accueil.service';

@Component({
  selector: 'app-popover',
  templateUrl: './popover.component.html',
  styleUrls: ['./popover.component.scss'],
})
export class PopoverComponent implements OnInit {
  grp: any;

  constructor(private accSer: AccueilService) { }

  ngOnInit() {
    this.grp=this.accSer.getGroup();
    console.log("g recup", this.grp);
    
  }

}
