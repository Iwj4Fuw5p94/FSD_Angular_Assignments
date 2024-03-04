import { Component } from '@angular/core';
import { PlayerServiceService } from '../player-service.service';
import { Player } from '../player.model';

@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent {

  players: Player[] = [];

  constructor(private playerService: PlayerServiceService) { }

  ngOnInit(): void {
    this.getPlayers();
  }

  getPlayers(): void {
    this.playerService.getAllPlayers()
      .subscribe((data: Player[]) => {
        this.players = data;
      });
  }
}
