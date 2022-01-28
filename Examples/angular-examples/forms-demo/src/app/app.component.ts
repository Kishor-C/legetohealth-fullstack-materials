import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'forms-demo';
  //supplying the EmployeeService
  constructor(private _service : EmployeeService) {}
  handleClick() : void {
    
  }
}
