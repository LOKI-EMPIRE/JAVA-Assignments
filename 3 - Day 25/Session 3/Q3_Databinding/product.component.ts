import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor() { }

  products = [
    {
      name : 'Product 1',
      price : 19.99,
      description : 'Product Description 1.'
    },
    {
      name : 'Product 2',
      price : 29.99,
      description : 'Product Description 2.'
    },
    {
      name : 'Product 3',
      price : 19.99,
      description : 'Product Description 3.'
    }
  ];
  

  ngOnInit(): void {
  }

}
