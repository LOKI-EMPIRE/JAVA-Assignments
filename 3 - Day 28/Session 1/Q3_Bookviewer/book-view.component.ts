import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { books } from 'src/books';

@Component({
  selector: 'app-bookview',
  templateUrl: './bookview.component.html',
  styleUrls: ['./bookview.component.css']
})
export class BookviewComponent implements OnInit {

  bookId:number;
  book:any;

  constructor(private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.bookId = parseInt(this.activatedRoute.snapshot.paramMap.get('id'));
    this.book = books.find(b => b.id === this.bookId);
  }

 
}
