import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-containerform',
  templateUrl: './containerform.component.html',
  styleUrls: ['./containerform.component.css']
})
export class ContainerformComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  
  otpSendByEmail(email:string){
    alert(email);
  }

  otpSendByNumber(phone:string){
    alert(phone);

  }
}
