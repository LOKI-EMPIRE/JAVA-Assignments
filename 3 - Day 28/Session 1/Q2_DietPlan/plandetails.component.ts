import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { meals } from 'src/meals';
 
@Component({
  selector: 'app-plandetails',
  templateUrl: './plandetails.component.html',
  styleUrls: ['./plandetails.component.css']
})
export class PlandetailsComponent implements OnInit {

  mealId:number;
  meal:any;

  constructor(private router:ActivatedRoute) { }

//   ngOnInit(): void {
//     this.mealId = this.activatedRoute.snapshot.paramMap.get('id');
//     this.meal = JSON.parse(this.activatedRoute.snapshot.queryParamMap.get('mealObj'));
//   }
 
  ngOnInit(): void {
    this.mealId = parseInt(this.router.snapshot.paramMap.get('id'));
    this.getMealbyId(this.mealId); 
  }

  getMealbyId(id:number){
    this.meal = meals.find(z=>z.id === id);
   
  }
 
}
