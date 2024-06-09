import { Component, OnInit } from '@angular/core';
import { Contato } from './contato';
import { ContatoService } from '../contato.service';

@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})
export class ContatoComponent implements OnInit {

  constructor(
    private service: ContatoService
  ) { }

  ngOnInit(): void {
    const c = new Contato();
    c.nome = 'jose'
    c.email = "jose@gmail.com"
    c.favorito = false

    this.service.save(c).subscribe(resposta => {
      console.log(resposta)
    })
  }

}