import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormulaireGroupePage } from './formulaire-groupe.page';

const routes: Routes = [
  {
    path: '',
    component: FormulaireGroupePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FormulaireGroupePageRoutingModule {}
