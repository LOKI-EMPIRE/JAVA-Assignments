import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-profile-card',
  templateUrl: './user-profile-card.component.html',
  styleUrls: ['./user-profile-card.component.css']
})
export class UserProfileCardComponent implements OnInit {

  initialUserAge:number = 25;
  userName:string = "John Doe";
  userAge:number = this.initialUserAge;

  constructor() { }

  incrementAge(){
    this.userAge++;
  }

  resetAge(){
    this.userAge = this.initialUserAge;
  }

  updateUserName(value:string){
    this.userName = value;
  }

  ngOnInit(): void {
  }

}
