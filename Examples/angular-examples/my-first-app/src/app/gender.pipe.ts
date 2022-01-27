import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderFormat'
})
export class GenderPipe implements PipeTransform {

  // accept name & return saluation beside the name like Mr. or Ms.
  // {{e.name | genderFormat : e.gender}}
  transform(value: string, gen: string): string {
    if(gen == 'Male') {
      return 'Mr. '+value;
    } else {
      return 'Ms.'+value;
    } 
  }
}
