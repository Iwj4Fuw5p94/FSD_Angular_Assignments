import { Component } from '@angular/core';
import { PlayerServiceService } from '../player-service.service';
import { Player } from '../player.model';
@Component({
  selector: 'app-getplayers',
  templateUrl: './getplayers.component.html',
  styleUrls: ['./getplayers.component.css']
})
export class GetplayersComponent {

  player:Player[]=[];


  constructor(private playerservice:PlayerServiceService ){
  }

  getall(){
    return this.playerservice.getAllPlayers().subscribe(
      (response)=>{
        console.log(response);
        this.player=response; 
      })

  }

}
