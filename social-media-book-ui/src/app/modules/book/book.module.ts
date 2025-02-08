import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BookRoutingModule } from './book-routing.module';
import { MainComponent } from './pages/main/main.component';
import { MenuComponent } from './componenets/menu/menu.component';
import { BookCardComponent } from './componenets/book-card/book-card.component';
import { BookListComponent } from './pages/book-list/book-list.component';
import { RatingComponent } from './componenets/rating/rating.component';


@NgModule({
  declarations: [
    MainComponent,
    MenuComponent,
    BookCardComponent,
    BookListComponent,
    RatingComponent
  ],
  imports: [
    CommonModule,
    BookRoutingModule,
  ],
})
export class BookModule { }
