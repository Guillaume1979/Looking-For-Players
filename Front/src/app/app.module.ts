import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import {RouterModule} from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { PlayerProfileComponent } from './player-profile/player-profile.component';
import { NewSessionComponent } from './new-session/new-session.component';
import { SessionListComponent } from './sessions-list/session-list.component';
import { FooterComponent } from './footer/footer.component';
import { CalendarComponent } from './calendar/calendar.component';
import {HttpClientModule} from '@angular/common/http';
import { PlayersListComponent } from './players-list/players-list.component';
import {PlayerAddComponent} from './player-add/player-add.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    TopBarComponent,
    NavbarComponent,
    HomeComponent,
    PlayerProfileComponent,
    NewSessionComponent,
    SessionListComponent,
    FooterComponent,
    CalendarComponent,
    PlayersListComponent,
    PlayerAddComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'playerprofile/:playerId', component: PlayerProfileComponent},
      {path: 'newsession', component: NewSessionComponent},
      {path: 'sessionsList', component: SessionListComponent},
      {path: 'playerslist', component: PlayersListComponent},
      {path: 'playeradd', component: PlayerAddComponent}
    ]),
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
