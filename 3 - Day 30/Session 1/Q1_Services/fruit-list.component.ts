import { Component, OnInit } from '@angular/core';
import { FruitService } from '../services/fruit.service';

@Component({
  selector: 'app-fruit-list',
  templateUrl: './fruit-list.component.html',
  styleUrls: ['./fruit-list.component.css']
})
export class FruitListComponent implements OnInit {

  fruits:any[] = [];

  constructor(private service:FruitService) {}

  ngOnInit(): void {
    this.fruits = this.service.getFruits();
  }

  deleteFruit(index:number){
    this.service.deleteFruit(index);
    this.fruits = this.service.getFruits();
  }

}
