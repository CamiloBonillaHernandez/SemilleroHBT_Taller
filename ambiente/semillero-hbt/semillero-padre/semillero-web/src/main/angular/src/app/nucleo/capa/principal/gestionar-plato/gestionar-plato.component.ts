import { Component, OnInit } from '@angular/core';
import { plato } from '../modelos/plato';
import {PlatoService} from '../servicios/consultasRest/Plato.Service';

@Component({
  selector: 'app-gestionar-plato',
  templateUrl: './gestionar-plato.component.html'
})
export class GestionarPlatoComponent implements OnInit {

  public plato : plato;
  public platos : plato[];
  constructor(private service : PlatoService) { }

  ngOnInit() {

    this.plato  = {
      idPlato :0,
      nombrePlato : '',
      precio  : 0,
      descPlato : ''
    }

  }
  
   /**
   * implementacion del servicio de consulta
   */
  consultarPlatos(){
    this.service.consultarPlatos().subscribe(
      input => {
          this.platos = input;
        },
        error => {
          console.log(error);
        } 
    );    
    console.log('resultado servicio platos  ' + this.platos);
  }  
}
