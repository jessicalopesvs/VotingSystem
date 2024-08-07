import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {VoteComponent} from "./vote/vote.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, VoteComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Vote BBB - Big Boy Band';
}
