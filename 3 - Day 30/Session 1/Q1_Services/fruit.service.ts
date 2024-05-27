import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FruitService {

  fruits:any[] = [];

  constructor() { }

  getFruits():any[]{
    return this.fruits;
  }

  addFruit(fruit:any){
    this.fruits.push(fruit);
  }

  deleteFruit(index:number){
    this.fruits.splice(index,1);
  }
}
