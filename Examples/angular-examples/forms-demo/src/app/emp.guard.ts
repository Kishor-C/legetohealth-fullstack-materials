import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmpGuard implements CanActivate {
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    // read the data from session
    let user = sessionStorage.getItem('user');
    // read the data from the route parameter
    let un = route.paramMap.get('un');
    if(user == un) {
      return true;
    }
    else {
      alert('sorry you need to login first!');
      return false;
    }
    
  }
  
}
