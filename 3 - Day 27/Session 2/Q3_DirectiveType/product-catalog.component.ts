import { Component, OnInit } from '@angular/core';
import { Products } from '../products';

@Component({
  selector: 'app-product-catalog',
  templateUrl: './product-catalog.component.html',
  styleUrls: ['./product-catalog.component.css']
})
export class ProductCatalogComponent implements OnInit {

  products:Products[] = [
    {
      name:'Product 1',
      description : 'Description of Product 1',
      price : 10,
      category : 'Category A'
    },
    {
      name:'Product 2',
      description : 'Description of Product 2',
      price : 20,
      category : 'Category B'
    },
    {
      name:'Product 3',
      description : 'Description of Product 3',
      price : 30,
      category : 'Category C'
    },
    {
      name:'Product 4',
      description : 'Description of Product 4',
      price : 40,
      category : 'Category A'
    },
    {
      name:'Product 5',
      description : 'Description of Product 5',
      price : 50,
      category : 'Category B'
    },
    {
      name:'Product 6',
      description : 'Description of Product 6',
      price : 60,
      category : 'Category C'
    }
  ];
  categories:string[] = ['All', 'Category A','Category B', 'Category C'];
  selectedCategory:string = "All";
  searchTerm = "";
  cart:Products[] = []

  addToCart(product:Products){
    this.cart.push(product);
  }

  removeFromCart(item:Products){
    let index = this.cart.indexOf(item);
    this.cart.splice(index,1);
  }

  constructor() {}

  ngOnInit(): void {
  }

}
