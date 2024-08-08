import { Routes } from '@angular/router';
import {VoteComponent} from "./vote/vote.component";
import {ComputeVoteComponent} from "./compute-vote/compute-vote.component";

export const routes: Routes = [

  {
    path: 'vote',
    component: VoteComponent
  },
  {
    path: 'compute-vote',
    component: ComputeVoteComponent
  },
  { path: '',
    redirectTo: '/vote',
    pathMatch: 'full'
  }
];
