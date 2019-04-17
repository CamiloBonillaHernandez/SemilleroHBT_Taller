import { Component, OnInit } from '@angular/core';
import {cliente} from '../modelos/cliente';
import { ClienteService } from '../servicios/consultasRest/Cliente.Service';

@Component({
  selector: 'app-gestionar-cliente',
  templateUrl: './gestionar-cliente.component.html'
})
export class GestionarClienteComponent implements OnInit {

  public cliente : cliente;
  public clientes : cliente[];
  constructor(private service: ClienteService) { }

  ngOnInit() {

    this.cliente = {
      idCliente : 0,
      nombreCliente : ''
    }
  }

 /**
   * implementacion del servicio de consulta
   */

  consultarClientes(){
    this.service.consultarClientes().subscribe(
      input => {
          this.clientes = input;
        },
        error => {
          console.log(error);
        } 
    );    
    console.log('resultado servicio Clientes  ' + this.clientes);
  }

}


