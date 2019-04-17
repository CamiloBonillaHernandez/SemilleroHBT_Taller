import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import {bebida} from '../../modelos/bebida';

@Injectable({
    providedIn: 'root'
})

/**
 *Clase que permite inplementar los servicios para Bebida 
 */
export class BebidaService extends AbstractService {
    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * consulta del total de bebidas en el sistema
   */
  public consultarBebidas() :  Observable<bebida[]> {
    return this.get<bebida[]>("/semillero-servicios", "/ConsultasRest/consultarBebidas");
  }
}