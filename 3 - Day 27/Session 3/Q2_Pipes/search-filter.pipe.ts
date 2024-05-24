import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {

  transform(items: any[], searchTerm: string): any[]{
    let item:any[] = items.filter(i => ( (i.name.toLowerCase()).includes(searchTerm.toLowerCase()) || (i.category.toLowerCase()).includes(searchTerm.toLowerCase())) );
    return item;
  }
}
