import { Component, OnInit } from '@angular/core';
import { Task } from '../task';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {

  tasks:Task[] = [];
  newTask:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  addTask(){
    if(this.newTask.trim()){
      this.tasks.push({title:this.newTask,completed:false});
    }
    this.newTask = "";
  }

  completeTask(task:Task){
    task.completed = !task.completed;
  }

  deleteTask(index:number){
    this.tasks.splice(index,1);
  }

}
