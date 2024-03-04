import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TotalMatchesPlayedComponent } from './total-matches-played/total-matches-played.component';
import { CreateplayerComponent } from './createplayer/createplayer.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { DisplayallComponent } from './displayall/displayall.component';
import { GetplayersComponent } from './getplayers/getplayers.component';
@NgModule({
  declarations: [
    AppComponent,
    TotalMatchesPlayedComponent,
    CreateplayerComponent,
       DashboardComponent,
       DisplayallComponent,
       GetplayersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
