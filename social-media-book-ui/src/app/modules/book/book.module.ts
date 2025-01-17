import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BookRoutingModule } from './book-routing.module';
import { MainComponent } from './pages/main/main.component';
import { MenuComponent } from './componenets/menu/menu.component';
import { BookCardComponent } from './componenets/book-card/book-card.component';


@NgModule({
  declarations: [
    MainComponent,
    MenuComponent,
    BookCardComponent
  ],
  imports: [
    CommonModule,
    BookRoutingModule
  ]
})
export class BookModule { }
