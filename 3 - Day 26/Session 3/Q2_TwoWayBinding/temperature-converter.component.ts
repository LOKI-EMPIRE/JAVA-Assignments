import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-temperature-converter',
  templateUrl: './temperature-converter.component.html',
  styleUrls: ['./temperature-converter.component.css']
})
export class TemperatureConverterComponent implements OnInit {

  inputValue:number;
  fromUnit:string;
  toUnit:string;
  result:number;

  constructor() { }

  convertTemperature(){
    if(this.fromUnit === undefined || this.toUnit === undefined){
    }
    else if(this.fromUnit === this.toUnit){
    }
    else if(this.fromUnit === "Celsius"){
      this.result = (this.inputValue*9/5)+32;
    }
    else{
      this.result = (this.inputValue-32)*5/9;
    }
  }

  ngOnInit(): void {
  }

}
