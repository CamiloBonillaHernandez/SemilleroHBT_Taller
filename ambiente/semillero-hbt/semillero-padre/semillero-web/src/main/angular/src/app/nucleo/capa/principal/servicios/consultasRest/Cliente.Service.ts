import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import {cliente} from '../../modelos/cliente';

@Injectable({
    providedIn: 'root'
})
/**
 * clase que permite implementar los servicios para cliente
 */
export class ClienteService extends AbstractService {
    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * servicio que permite consultar el total de clientes en el sistema
   */
  public consultarClientes() :  Observable<cliente[]> {
    return this.get<cliente[]>("/semillero-servicios", "/ConsultasRest/consultarCliente");
  }
}