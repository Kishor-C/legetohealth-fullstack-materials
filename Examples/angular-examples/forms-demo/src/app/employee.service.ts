import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

// This object is available from the root component
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  baseUrl = 'http://localhost:9090'
  constructor(private _client : HttpClient) { }

  fetchEmployees() : Observable<any> {
    let url = `${this.baseUrl}/employee`;
    return this._client.get(url);
  }
  store(employeeData : any) : Observable<any> {
    let url = '';// complete this
    return this._client.post(url, employeeData);
  }
  fetchEmployeeById(empId : number): Observable<any> {
    let url = `${this.baseUrl}/employee/${empId}`;
    return this._client.get(url);
  }
  updateSalary(empId: number, salary: number): Observable<any> {
    let url = ''// complete this
    return this._client.put(url, undefined); // put 2nd argument is body
  }
}
