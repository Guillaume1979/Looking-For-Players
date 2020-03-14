import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Player} from '../class/player';

@Injectable({
  providedIn: 'root'
})
export class ApiConnectionService {

  constructor(private http: HttpClient) {
  }


  getPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>('http://localhost:8080/api/players');
  }


}
