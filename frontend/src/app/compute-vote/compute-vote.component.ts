import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {RestService} from "../service/rest.service";
import {Contestant} from "../model/contestant";

@Component({
  selector: 'app-compute-vote',
  standalone: true,
  imports: [],
  templateUrl: './compute-vote.component.html',
  styleUrl: './compute-vote.component.css'
})
export class ComputeVoteComponent implements OnInit {
  title = 'Test vote component';
  vote: string = '';
  voteID : string = '';


  constructor(
    private activeRoute: ActivatedRoute,
    private service: RestService
  ) {}

  ngOnInit(): void {
    this.activeRoute.queryParams.subscribe((params) => {
      const paramID = params['id'];  // Get the 'id' from the query parameters
      this.voteID = paramID

      if (paramID) {
        this.sendVote(paramID);  // Pass the id to the sendVote method
      }
    });
  }

  sendVote(id: string) {
    let request = { id: id };  // Prepare the request payload

    this.service.postData('/vote', request).subscribe((response) => {
      console.log('Response' + response);
      let contestant = response as Contestant;  // Cast the response to Contestant type
      this.vote = contestant.name;  // Update the vote property with the contestant's name
    });
  }
}
