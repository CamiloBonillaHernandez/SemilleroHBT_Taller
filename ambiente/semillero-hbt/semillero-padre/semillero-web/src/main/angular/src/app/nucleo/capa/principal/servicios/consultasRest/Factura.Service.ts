import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import {factura} from '../../modelos/factura';

@Injectable({
    providedIn: 'root'
})

/**
 * clase que permite implementar los servicios para Factura
 */
export class FacturaService extends AbstractService {
    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * Servicio que permite consultar el total de facturas en el sistema
   */
  public consultarFacturas() :  Observable<factura[]> {
    return this.get<factura[]>("/semillero-servicios", "/ConsultasRest/consultarFacturas");
  }
}