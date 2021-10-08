import { Tema } from './../model/tema';
import { User } from './../model/user';
import { AuthService } from './../service/auth.service';
import { PostagemService } from './../service/postagem.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment.prod';
import { Postagem } from '../model/postagem';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  postagem: Postagem = new Postagem()
  listarPostagem: Postagem[]

  user: User = new User()
  idUser = environment.id

  tema: Tema = new Tema()
  listarTemas: Tema[]

  constructor(
    private router: Router,
    private postagemService: PostagemService,
    private authService: AuthService
  ) { }

  ngOnInit() {
    if (environment.token == '') {
      this.router.navigate(['/entrar'])
    }

    this.getAllPostagens()
  }

  findByIdUser() {
    this.authService.getByIdUser(this.idUser).subscribe((resp: User) => {
      this.user = resp
    })
  }

  getAllPostagens() {
    this.postagemService.getAllPostagens().subscribe((resp: Postagem[]) => {
      this.listarPostagem = resp
    })
  }


}
