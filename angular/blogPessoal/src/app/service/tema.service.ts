import { Tema } from './../model/tema';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment.prod';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(
    private http: HttpClient
  ) { }

  token = {
    headers: new HttpHeaders().set('Authorization', environment.token)
  }

  getAllTema(): Observable<Tema[]> {
    return this.http.get<Tema[]>('https://blogpessoaljp.herokuapp.com/temas', this.token)
  }

  postTema(tema: Tema): Observable<Tema>{
    return this.http.post<Tema>('https://blogpessoaljp.herokuapp.com/temas', tema, this.token)
  }

  putTema(tema: Tema): Observable<Tema> {
    return this.http.put<Tema>('https://blogpessoaljp.herokuapp.com/temas', tema, this.token)
  }
}
