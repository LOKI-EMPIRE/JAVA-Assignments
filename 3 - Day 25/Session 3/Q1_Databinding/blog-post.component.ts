import { Component, OnInit } from '@angular/core';
import { BlogPost } from 'src/models/blog-post.model';

@Component({
  selector: 'app-blog-post',
  templateUrl: './blog-post.component.html',
  styleUrls: ['./blog-post.component.css']
})
export class BlogPostComponent implements OnInit {

  constructor() { }

  post:BlogPost = {
    title : 'Sample Blog Post',
    author : 'Anil Doe',
    date : '2024-04-25',
    content : 'This is a sample blog post content.'
  }

  ngOnInit(): void {
  }

}
