import { Component, OnInit } from '@angular/core';
import { quizQuestions } from 'src/quiz';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

  quizQuestions:any[] = quizQuestions;
  currentQuestionIndex:number = 0;
  showFeedback:boolean = false;
  feedback:string ="";
  score:number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  checkAnswer(optionIndex:number){
    if(this.quizQuestions[this.currentQuestionIndex].correctAnswer == this.quizQuestions[this.currentQuestionIndex].options[optionIndex]){
      this.showFeedback = true;
      this.feedback = "Correct";
      this.score++;
      setInterval(() => this.nextQuestion(),5000);
    }else{
      this.showFeedback = true;
      this.feedback = "Incorrect";
      setInterval(() => this.nextQuestion(),5000);
    }
  }

  nextQuestion(){
    if(this.currentQuestionIndex > this.quizQuestions.length-1){
      this.endQuiz();
    }else{
      this.currentQuestionIndex++;
      this.feedback = "";
      this.showFeedback = false;
    }
  }

  endQuiz() : boolean{
    if(this.currentQuestionIndex > this.quizQuestions.length-1){
      return true;
    }
    return false;
  }

  restartQuiz(){
    this.currentQuestionIndex = 0;
    this.score = 0;
    this.showFeedback = false;
    this.feedback = "";
  }

}
