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

  constructor(
    private activeRoute: ActivatedRoute,
    private service: RestService
  ) {}

  ngOnInit(): void {
    this.activeRoute.queryParams.subscribe((params) => {
      const voteId = params['id'];  // Get the 'id' from the query parameters
      if (voteId) {
        this.sendVote(voteId);  // Pass the id to the sendVote method
      }
    });
  }

  sendVote(id: string) {
    const request = { id: id };  // Prepare the request payload

    this.service.postData('vote', request).subscribe((response) => {
      console.log(response);
      const contestant = response as Contestant;  // Cast the response to Contestant type
      this.vote = contestant.name;  // Update the vote property with the contestant's name
    });
  }
}
