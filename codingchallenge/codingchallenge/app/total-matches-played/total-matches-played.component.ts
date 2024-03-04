import { Component } from '@angular/core';
import { PlayerServiceService } from '../player-service.service';

@Component({
  selector: 'app-total-matches-played',
  templateUrl: './total-matches-played.component.html',
  styleUrls: ['./total-matches-played.component.css']
})
export class TotalMatchesPlayedComponent {
  totalMatches: number | null = null;
  country: string = '';

  constructor(private playerService: PlayerServiceService) {}

  fetchTotalMatches() {
    this.playerService.getTotalMatchesByCountry(this.country).subscribe(
      (total: number) => {
        this.totalMatches = total;
        console.log('Total matches for ' + this.country + ': ' + total);
      }
     
    );
  }
}
