import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { books } from 'src/books';

@Component({
  selector: 'app-booklist',
  templateUrl: './booklist.component.html',
  styleUrls: ['./booklist.component.css']
})
export class BooklistComponent implements OnInit {

  books:any[] = books;

  constructor(private rt:Router) { }

  ngOnInit(): void {
  }

  viewBookDetails(id:number){
    this.rt.navigate(["/bookview",id]);
  }

}
