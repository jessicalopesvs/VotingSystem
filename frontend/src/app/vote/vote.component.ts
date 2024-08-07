import {Component, OnInit} from '@angular/core';
import {Contestant} from "../model/contestant";
import {NgForOf} from "@angular/common";
import {RestService} from "../service/rest.service";

@Component({
  selector: 'app-vote',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './vote.component.html',
  styleUrl: './vote.component.css'
})
export class VoteComponent implements OnInit {

  title = 'Test vote component';
  contestants: Contestant [] | undefined;

  constructor(private service : RestService) {}

  ngOnInit(): void {
    this.getContestants();
  }

  getContestants(){
    // this.contestants = [{id:'a',name:'Brian'},{id:'2',name:'Nick'},
    //   {id:'3',name:'Kevin'},
    //   {id:'4',name:'AJ'},
    //   {id:'5',name:'Howie'}]
    this.service
      .getData('/contestants/list')
      .subscribe(
        (contestants) =>{
      this.contestants = contestants
    })
  }
}
