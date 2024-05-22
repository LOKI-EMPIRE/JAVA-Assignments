import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-click-counter',
  templateUrl: './click-counter.component.html',
  styleUrls: ['./click-counter.component.css']
})
export class ClickCounterComponent implements OnInit {

  counter:number = 0;

  constructor() { }

  incrementCounter(){
    this.counter++;
  }

  resetCounter(){
    this.counter = 0;
  }

  ngOnInit(): void {
  }

}
