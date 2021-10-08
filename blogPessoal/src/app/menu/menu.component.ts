import { TemaService } from './../service/tema.service';
import { Postagem } from './../model/postagem';
import { environment } from 'src/environments/environment.prod';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { PostagemService } from '../service/postagem.service';
import { Tema } from '../model/tema';
import { User } from '../model/user';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  postagem: Postagem = new Postagem()
  listaPostagens: Postagem[]


  listaTemas: Tema[]
  idTema: number
  tema: Tema = new Tema()

  foto = environment.fotoPerfil
  user: User = new User()
  idUser = environment.id


  constructor(
    private router: Router,
    private postagemService: PostagemService,
    private temaService: TemaService,
    public authService: AuthService
  ) { }

  ngOnInit() {
    window.scroll(0, 0)

    if (environment.token == '') {
      this.router.navigate(['/entrar'])
    }

    this.getAllTemas()
    this.getAllPostagens()

  }

  getAllPostagens() {
    this.postagemService.getAllPostagens().subscribe((resp: Postagem[]) => {
      this.listaPostagens = resp
    })
  }

  publicar() {
    this.tema.id = this.idTema
    this.postagem.tema = this.tema

    this.user.id = this.idUser
    this.postagem.user = this.user

    this.postagemService.postPostagem(this.postagem).subscribe((resp: Postagem) => {
      this.postagem = resp
      this.postagem = new Postagem()
      alert('Sua postagem feita!')
      this.getAllPostagens()
    })
  }

  getAllTemas() {
    this.temaService.getAllTema().subscribe((resp: Tema[]) => {
      this.listaTemas = resp
    })
  }

  findByIdTema() {
    this.temaService.getByIdTema(this.idTema).subscribe((resp: Tema) => {
      this.tema = resp
    })
  }

  sair() {
    this.router.navigate(['/entrar'])
    environment.id = 0
    environment.nome = ''
    environment.username = ''
    environment.token = ''
    environment.email = ''
    environment.admin = ''
    environment.fotoPerfil = ''
  }
}
