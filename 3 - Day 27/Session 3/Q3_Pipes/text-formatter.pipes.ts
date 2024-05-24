import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'textFormatter'
})
export class TextFormatterPipe implements PipeTransform {

  transform(inputText: string, selectedFormat:string): string {
    if(selectedFormat == 'uppercase'){
      return inputText.toUpperCase();
    }

    else if(selectedFormat == 'lowercase'){
      return inputText.toLowerCase();
    }

    else if(selectedFormat == 'capitalize'){
      let str:string[] = inputText.split(" ");
      for(let s of str){
        s.charAt(0).toUpperCase();
      }
      inputText = str.join(" ");
      return inputText;
    }

    else if(selectedFormat == 'reverse'){
      return inputText.split("").reverse().join("");
    }
    
    else{
      return inputText;
    }
  }

}
