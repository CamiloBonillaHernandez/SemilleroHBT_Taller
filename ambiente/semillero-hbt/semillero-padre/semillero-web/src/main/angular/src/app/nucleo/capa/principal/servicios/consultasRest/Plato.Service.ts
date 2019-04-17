import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import {plato} from '../../modelos/plato';

@Injectable({
    providedIn: 'root'
})
/**
 *  clase que permite implementar los servicios para plato
 */
export class PlatoService extends AbstractService {
    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }
  /**
   * servicio que permite consultar el total de platos en el sistema
   */
  public consultarPlatos() :  Observable<plato[]> {
    return this.get<plato[]>("/semillero-servicios", "/ConsultasRest/consultarPlatos");
  }
}