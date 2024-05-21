import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-dynamic-message',
  templateUrl: './dynamic-message.component.html',
  styleUrls: ['./dynamic-message.component.css']
})
export class DynamicMessageComponent implements OnInit {

  @ViewChild("message") messageElement:ElementRef;

  constructor() { }

  ngOnInit(): void {
  }

  updateMessage(){
    this.messageElement.nativeElement.innerText="New message generated on button click!";
  }

}
