import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'textFormatter'
})
export class TextFormatterPipe implements PipeTransform {

  transform(inputText: string, selectedFormat:string ,seperator:string=' '): string {
    if(selectedFormat == 'uppercase'){
      return inputText.toUpperCase();
    }

    else if(selectedFormat == 'lowercase'){
      return inputText.toLowerCase();
    }

    else if(selectedFormat == 'capitalize'){
      if(inputText.includes(" ")){
        let str:string[] = inputText.split(seperator);
        for(let i=0; i<str.length; i++){
          str[i] = str[i].charAt(0).toUpperCase() + str[i].slice(1);
        }
        return str.join(seperator);
      }
      return inputText.charAt(0).toUpperCase() + inputText.slice(1);
    }
    

    else if(selectedFormat == 'reverse'){
      return inputText.split("").reverse().join("");
    }

    else{
      return inputText;
    }
  }

  // constructor(private up:UpperCasePipe,
  //   private low:LowerCasePipe,
  //   private cap:TitleCasePipe
  //   ){}
 
  // transform(value: string,format:string,seperator:string=' '): string {
  //   switch(format){
  //     case 'uppercase':
  //       return this.up.transform(value);
  //     case 'lowercase':
  //       return this.low.transform(value);
  //     case 'capitalize':
  //       return this.cap.transform(value);
  //     case 'reverse':
  //       return value.split('').reverse().join('');
  //     default:
  //       return value;
  //   }

}
