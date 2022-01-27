import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent  {

  username: string = 'Alex';
  toggleButton: boolean = false;

  handleClick(v: string) : void {
    this.username = v;
    this.toggleButton = !this.toggleButton;
  }

}
