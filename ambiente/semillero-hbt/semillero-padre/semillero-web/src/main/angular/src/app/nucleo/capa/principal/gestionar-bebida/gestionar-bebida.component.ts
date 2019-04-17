import { Component, OnInit } from '@angular/core';
import {bebida} from '../modelos/bebida'
import {BebidaService} from '../servicios/consultasRest/Bebida.Service';

@Component({
  selector: 'app-gestionar-bebida',
  templateUrl: './gestionar-bebida.component.html'
})
export class GestionarBebidaComponent implements OnInit {
  public title = "Gestion Bebida";
  public bebida : bebida;
  public bebidas : bebida[];
  public gestionarBebida :boolean;
  public guardarBebida : boolean;
  public editarBebida : boolean;

  constructor(private service: BebidaService) { }

  ngOnInit() {

    this.bebida = {
      idBebida  : 0,
      nombre : '',
      precio : 0
    }

  }

  /**
   * implementacion del servicio de consulta
   */
  public consultarBebida(){
    this.service.consultarBebidas().subscribe(
      input => {
          this.bebidas = input;
        },
        error => {
          console.log(error);
        } 
    );    
    console.log('resultado servicio Bebidas  ' + this.bebidas);
  }


  /**
   * permite mostrar el formulario de gestion
   */
  public gestionar(){
    this.gestionarBebida = true;
    this.editarBebida  = false;
    this.guardarBebida = false;
  }

   /**
   * permite mostrar el formulario de editar
   */
  public editar(){;
    this.editarBebida  = true;
    this.guardarBebida = false;
    this.gestionarBebida = false;
  }

   /**
   * permite mostrar el formulario de guardar
   */
  public guardar(){
    this.guardarBebida= true;
    this.editarBebida  = false;
    this.gestionarBebida = false;
  }

}
