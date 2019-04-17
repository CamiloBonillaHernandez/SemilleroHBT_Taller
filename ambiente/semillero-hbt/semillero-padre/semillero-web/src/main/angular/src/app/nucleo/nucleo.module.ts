import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { PrincipalComponent } from './capa/principal/principal.component';
import { PiePaginaComponent } from './capa/pie-pagina/pie-pagina.component';
import { FormsModule } from '@angular/forms';
import { GestionarBebidaComponent } from './capa/principal/gestionar-bebida/gestionar-bebida.component';
import { GestionarPlatoComponent } from './capa/principal/gestionar-plato/gestionar-plato.component';
import { GestionarClienteComponent } from './capa/principal/gestionar-cliente/gestionar-cliente.component';
import { GestionarFacturaComponent } from './capa/principal/gestionar-factura/gestionar-factura.component';
import {BebidaService} from './capa/principal/servicios/consultasRest/Bebida.Service';
import {PlatoService} from './capa/principal/servicios/consultasRest/Plato.Service';
import {ClienteService} from './capa/principal/servicios/consultasRest/Cliente.Service';
import {FacturaService} from './capa/principal/servicios/consultasRest/Factura.Service';
import { from } from 'rxjs';


//Nucleo representa al modulo que va a contener los componentes que van a orquestar la aplicacion 
//Debe ser importado en el componente principal AppModule
@NgModule({
  declarations: [CapaComponent, EncabezadoComponent, PrincipalComponent, PiePaginaComponent, GestionarBebidaComponent, GestionarPlatoComponent, GestionarClienteComponent, GestionarFacturaComponent],
  imports: [
    CommonModule,RouterModule,FormsModule
  ],
  exports: [
  	CapaComponent
  ],
  providers: [
      BebidaService, PlatoService , ClienteService , FacturaService
  ]
})
export class NucleoModule { }
