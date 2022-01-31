import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
import { HttpClientModule } from '@angular/common/http';
import { FetchEmployeeComponent } from './fetch-employee/fetch-employee.component';
import { FetchEmployeesComponent } from './fetch-employees/fetch-employees.component';
import { Routes, RouterModule } from '@angular/router';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProfileComponent } from './profile/profile.component';
import { SettingsComponent } from './settings/settings.component';
import { EmpGuard } from './emp.guard';
// path & components configuration
let routeConfig: Routes = [
  {path : '', component : FetchEmployeesComponent},
  {path : 'loadAll', component : FetchEmployeesComponent},
  {path : 'loadById', component : FetchEmployeeComponent},
  {path : 'tdf', component : TdfDemoComponent},
  {path : 'mdf', component : MdfDemoComponent},
  {path : 'success/:un', component: SuccessComponent, canActivate: [EmpGuard],  children : [
    {path : '', component : DashboardComponent},{path : 'dashboard', component : DashboardComponent},
    {path : 'profile', component : ProfileComponent}, {path : 'settings', component : SettingsComponent}
  ]}
]
@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfDemoComponent,
    FetchEmployeeComponent,
    FetchEmployeesComponent,
    SuccessComponent,
    DashboardComponent,
    ProfileComponent,
    SettingsComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule, HttpClientModule,
    RouterModule.forRoot(routeConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
