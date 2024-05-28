import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user:any = { firstName: "",
  lastName: "",
  mobileNumber: "",
  email: "",
  password: "",
  confirmPassword: ""
  };

  isFormSubmitted = false;

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(registartionForm:NgForm){
    if(registartionForm.valid){
      this.isFormSubmitted = true;
    }
  }

  resetForm(registartionForm:NgForm){
    registartionForm.reset();
    this.isFormSubmitted = false;
  }

}
