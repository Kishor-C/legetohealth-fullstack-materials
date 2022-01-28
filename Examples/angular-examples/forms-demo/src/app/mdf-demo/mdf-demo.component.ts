import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-mdf-demo',
  templateUrl: './mdf-demo.component.html',
  styleUrls: ['./mdf-demo.component.css']
})
export class MdfDemoComponent  {

  // Angular supplies the FormBuilder object to this component
  constructor(private _builder : FormBuilder) { }

  profile = this._builder.group({
    firstname: ['', Validators.compose([Validators.required, Validators.minLength(3)])], 
    lastname: ['', Validators.compose([Validators.required, Validators.minLength(2)])]
  });

  handleSubmit() : void {
    console.log(this.profile.value);
    this.profile.reset({});
  }
  
}
