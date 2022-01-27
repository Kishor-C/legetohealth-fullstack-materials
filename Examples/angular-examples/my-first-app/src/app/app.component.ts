import { Component } from '@angular/core';

/*
 selector: tag name
 templateUrl: content for the selector
 styleUrls: style for the component
*/
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
  users = [
    {name : 'Alex', gender: 'Male'},
    {name : 'Jennifer', gender: 'Female'},
    {name : 'Sonia', gender : 'Female'}, 
    {name : 'Sachin', gender: 'Male'}
  ]
}
