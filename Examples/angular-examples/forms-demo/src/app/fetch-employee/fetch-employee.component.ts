import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-fetch-employee',
  templateUrl: './fetch-employee.component.html',
  styleUrls: ['./fetch-employee.component.css']
})
export class FetchEmployeeComponent implements OnInit {
  // use service & builder
  constructor(private _service : EmployeeService, 
    private _builder : FormBuilder) { }
  ngOnInit(): void {
  }
  employee = this._builder.group({
    id : [], name : [], salary: []
  })
  emp : any = undefined;
  errorMessage : any = undefined;
  handleClick() : void {
    let id = this.employee.controls['id'].value;
    this._service.fetchEmployeeById(id).subscribe(response => {
      this.emp = response;
      this.errorMessage = undefined;
    }, err => {
      this.errorMessage = err.error.error;
      this.emp = undefined;
    });
    // clear the id control
    this.employee.reset({});
  }
}
