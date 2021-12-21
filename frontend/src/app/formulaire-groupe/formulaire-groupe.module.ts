import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { FormulaireGroupePageRoutingModule } from './formulaire-groupe-routing.module';

import { FormulaireGroupePage } from './formulaire-groupe.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    FormulaireGroupePageRoutingModule
  ],
  declarations: [FormulaireGroupePage]
})
export class FormulaireGroupePageModule {}
