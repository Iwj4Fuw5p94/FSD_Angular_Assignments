import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateplayerComponent } from './createplayer/createplayer.component';
import { TotalMatchesPlayedComponent } from './total-matches-played/total-matches-played.component';
import { DisplayallComponent } from './displayall/displayall.component';


const routes: Routes = [
  { path: 'create-player', component: CreateplayerComponent },
  {path:'get-matches', component: TotalMatchesPlayedComponent},
  {path:'displayall', component: DisplayallComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
