import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
import { HttpClientModule } from '@angular/common/http';
import { FetchEmployeeComponent } from './fetch-employee/fetch-employee.component';
import { FetchEmployeesComponent } from './fetch-employees/fetch-employees.component';

@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfDemoComponent,
    FetchEmployeeComponent,
    FetchEmployeesComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
