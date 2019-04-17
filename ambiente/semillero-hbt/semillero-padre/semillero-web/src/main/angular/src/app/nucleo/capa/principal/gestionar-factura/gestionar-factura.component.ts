import { Component, OnInit } from '@angular/core';
import {FacturaService} from '../servicios/consultasRest/Factura.Service'
import { factura } from '../modelos/factura';

@Component({
  selector: 'app-gestionar-factura',
  templateUrl: './gestionar-factura.component.html'
})
export class GestionarFacturaComponent implements OnInit {

  public facturas : factura[];

  constructor(private service : FacturaService) { }

  ngOnInit() {
  }

   /**
   * implementacion del servicio de consulta
   */
  consultarFactura(){
    this.service.consultarFacturas().subscribe(
      input => {
        this.facturas = input;
      },
        error => {
          console.log(error);
        } 
    );    
    console.log('resultado servicio Facturas  ' + this.facturas);
  }

}
