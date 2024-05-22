import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-countdown',
  templateUrl: './countdown.component.html',
  styleUrls: ['./countdown.component.css']
})
export class CountdownComponent implements OnInit{

  countdown:number = 0;
  intervalId:any;

  constructor() {}

   startCountdown(seconds:number):void{
    this.countdown = seconds;
    this.intervalId = setInterval(() =>{
      this.countdown--;
      if(this.countdown === 0){
        clearInterval(this.intervalId);
      }
    },1000);
  }
   
   ngOnInit():void {
   }

}
