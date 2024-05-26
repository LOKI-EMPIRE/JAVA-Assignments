import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { meals } from 'src/meals';

@Component({
  selector: 'app-dietplan',
  templateUrl: './dietplan.component.html',
  styleUrls: ['./dietplan.component.css']
})
export class DietplanComponent implements OnInit {

  meals:any[] = meals;

  constructor(private rt:Router) {}

  ngOnInit(): void {
  }

  viewMealDetails(mealId:number){
    let meal:any = meals.find(m => m.id==mealId);
    this.rt.navigate(['/plandetail',mealId] , {queryParams: {mealObj:JSON.stringify(meal)}} );
  }

}
