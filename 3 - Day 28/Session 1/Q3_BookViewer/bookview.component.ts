import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { books } from 'src/books';
 
@Component({
 selector: 'app-bookview',
 templateUrl: './bookview.component.html',
 styleUrls: ['./bookview.component.css']
})
export class BookviewComponent implements OnInit {
 book:any;
 constructor(private route:ActivatedRoute,private router:Router) { }
 
 ngOnInit(): void {
   this.route.params.subscribe(params=>
     {
       const id=+params['id'];
       this.book=books.find(book=>book.id===id);
     });
 }
 
}
