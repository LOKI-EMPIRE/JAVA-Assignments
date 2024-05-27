import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BooklistComponent } from './booklist/booklist.component';
import { BookviewComponent } from './bookview/bookview.component';
 
const routes: Routes = [
 {path:'booklist',component:BooklistComponent},
 {path:'bookview/:id',component:BookviewComponent},
 {path:'',redirectTo:'/booklist',pathMatch:'full'}
];
 
@NgModule({
 imports: [RouterModule.forRoot(routes)],
 exports: [RouterModule]
})
export class AppRoutingModule { }
