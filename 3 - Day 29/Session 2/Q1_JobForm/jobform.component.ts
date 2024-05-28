import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-jobform',
  templateUrl: './jobform.component.html',
  styleUrls: ['./jobform.component.css']
})
export class JobformComponent implements OnInit {

  submitted: boolean = false;
  formData: NgForm;
  options: string[] = ["Male", "Female", "Others"];
  jobPosition: string[] = ["Manager", "SME", "SDE", "Trainee",];
  experience: String[] = ["2-4", "5-10", "10-15"];

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(form: NgForm) {
    if (form.valid) {
      this.submitted = true;
      this.formData = form;
    }
  }

  closeModal() {
    this.submitted = false;
    this.formData.reset();
  }

}
