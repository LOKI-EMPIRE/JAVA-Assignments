import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'characterCounter'
})
export class CharacterCounterPipe implements PipeTransform {

  transform(inputText:string): number {
    if(inputText){
      return inputText.length;
    }
    return 0;
  }

}
