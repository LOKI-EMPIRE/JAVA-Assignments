import { Component, OnInit } from '@angular/core';
import { FruitService } from '../services/fruit.service';
import { NgForm } from '@angular/forms';
import { from } from 'rxjs';

@Component({
  selector: 'app-add-fruit',
  templateUrl: './add-fruit.component.html',
  styleUrls: ['./add-fruit.component.css']
})
export class AddFruitComponent implements OnInit {

  name:string;
  color:string;
  origin:string;

  constructor(private service:FruitService) { }

  ngOnInit(): void {
  }

  addFruit(form:NgForm){
    let fr = {name:form.value.name,color:form.value.color,origin:form.value.origin};
    this.service.addFruit(fr);
  }

}
