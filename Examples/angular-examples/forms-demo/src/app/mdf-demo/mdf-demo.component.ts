import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-mdf-demo',
  templateUrl: './mdf-demo.component.html',
  styleUrls: ['./mdf-demo.component.css']
})
export class MdfDemoComponent  {

  // Angular supplies the FormBuilder object & Router to this component
  constructor(private _router: Router, private _builder : FormBuilder) { }

  profile = this._builder.group({
    firstname: ['', Validators.compose([Validators.required, Validators.minLength(3)])], 
    lastname: ['', Validators.compose([Validators.required, Validators.minLength(2)])]
  });

  handleSubmit() : void {
    let firstname = this.profile.controls['firstname'].value;
    // hardcode way of authenticating, though this is not a right way of authenticating
    if(firstname == 'Alex') {
      // storing the username in the session
      sessionStorage.setItem('user', firstname);
      this._router.navigate(['success', firstname]) // request path will be success/firstnameValue -> /success/:un
    } else {
      this._router.navigate(['mdf']);
      this.profile.reset({});
    }
  }
  
}
