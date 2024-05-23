import { Component, OnInit } from '@angular/core';
import { Book } from '../book';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  
  books:Book[] = [];
  newBookTitle:string = "";

  constructor() {}

  ngOnInit(): void {
  }

  addBook(){
    if(this.newBookTitle.trim()){
      this.books.push({title:this.newBookTitle, completed:false});
    }
    this.newBookTitle = "";
  }

  completeBook(book:Book){
    book.completed = !book.completed;
  }

  deleteBook(index:number){
    this.books.splice(index,1);
  }


}
