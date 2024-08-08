import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from "@angular/router";
import {routes} from "./app.routes";



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes, {enableTracing: true})
  ],
  exports: [
    RouterModule  // Export RouterModule to make routing directives available in other modules
  ]

})
export class AppRoutingModule { }
