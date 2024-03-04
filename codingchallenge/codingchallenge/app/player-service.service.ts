import { Injectable } from '@angular/core';
import { Player } from './player.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PlayerServiceService {
  constructor(private http: HttpClient) {}
  apiUrl:string='http://localhost:8080/api/players/';
  

  createPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(this.apiUrl+"create",player);
  }
 
  getTotalMatchesByCountry(country: string): Observable<number> {
    return this.http.get<number>(this.apiUrl + 'totalmatchesbycountry/' + country);
  }
  getAllPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(`${this.apiUrl}getall`);
  }
  getplayerbymatches(country:String): Observable<Player[]>{
    return this.http.get<Player[]>(`${this.apiUrl}`)
}
}
