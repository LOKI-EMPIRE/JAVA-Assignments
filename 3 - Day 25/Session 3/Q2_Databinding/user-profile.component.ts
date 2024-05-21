import { Component, OnInit } from '@angular/core';
import { User } from 'src/models/user.model';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {

  constructor() { }

  user:User = {
    name : 'John Doe',
    age : 30,
    email : 'john.doe@example.com'
  }

  ngOnInit(): void {
  }

}
