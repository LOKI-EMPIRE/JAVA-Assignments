import { Component, OnInit } from '@angular/core';
import { Item } from '../item';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {
  
  items:Item[] = [];
  newItemName:string = "";

  constructor() {}

  ngOnInit(): void {
  }

  addItem():void{
     if(this.newItemName.trim()){
      this.items.push({name:this.newItemName , purchased:false});
     }
     this.newItemName = "";
  }

  purchaseItem(item:Item){
    item.purchased = !item.purchased;
  }

  deleteItem(index:number){
    this.items.splice(index,1);
  }

}
