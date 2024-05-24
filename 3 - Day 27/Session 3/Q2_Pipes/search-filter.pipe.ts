import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {

  transform(items: any[], searchText: string): any[]{
    let item:any[] = items.filter(i => ( i.name.includes(searchText) || i.category.includes(searchText) ));
    return item;
  }
}
