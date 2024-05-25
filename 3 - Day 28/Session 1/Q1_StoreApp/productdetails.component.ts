import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-productdetails',
  templateUrl: './productdetails.component.html',
  styleUrls: ['./productdetails.component.css']
})
export class ProductdetailsComponent implements OnInit {

  id:string;
  description:string;
  price:number;

  constructor(private rt:Router , private activatedRoute:ActivatedRoute) {}

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    this.description = this.activatedRoute.snapshot.queryParamMap.get('description');
    this.price = parseInt(this.activatedRoute.snapshot.queryParamMap.get('price'));
  }

  closeModal(){
    this.rt.navigate(['/productlist']);
  }

}
