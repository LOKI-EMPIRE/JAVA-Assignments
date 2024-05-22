import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-colorpicker',
  templateUrl: './colorpicker.component.html',
  styleUrls: ['./colorpicker.component.css']
})
export class ColorpickerComponent implements OnInit {

  colors:string[] = ['Red','Green','Blue','Yellow','Purple'];
  selectedColor:string = "";

  constructor() { }

  onColorChange(newColor:string){
    this.selectedColor = newColor;
  }

  ngOnInit(): void {
  }

}
