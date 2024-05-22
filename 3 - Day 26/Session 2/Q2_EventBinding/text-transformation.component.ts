import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-text-transformation',
  templateUrl: './text-transformation.component.html',
  styleUrls: ['./text-transformation.component.css']
})
export class TextTransformationComponent implements OnInit {

  transformedText:string;
  textLength:number;
  lowercaseCount:number;
  uppercaseCount:number;
  numberCount:number;
  specialCharCount:number;

  constructor() {}

  transformText(inputText:string):void{
    this.transformedText = inputText.toUpperCase();
    this.textLength = inputText.length;
    this.lowercaseCount = 0;
    this.uppercaseCount = 0;
    this.numberCount = 0;
    this.specialCharCount= 0;
    for(let i=0; i<inputText.length; i++){
      let char = inputText[i];
      if(char>='a' && char<='z'){
        this.lowercaseCount++;
      }
      else if(char>='A' && char<='Z'){
        this.uppercaseCount++;
      }
      else if(char>='0' && char<='9'){
        this.numberCount++;
      }
      else{
        this.specialCharCount++;
      }
    }
  }

  ngOnInit(): void {
  }

}
