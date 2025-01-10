import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../../services/services';

@Component({
  selector: 'app-activate-account',
  templateUrl: './activate-account.component.html',
  styleUrl: './activate-account.component.scss'
})
export class ActivateAccountComponent {

  message='';
  isOkay=true;
  submitted=false;
  constructor(
    private router: Router,
    private authService: AuthenticationService
  ){}
}
