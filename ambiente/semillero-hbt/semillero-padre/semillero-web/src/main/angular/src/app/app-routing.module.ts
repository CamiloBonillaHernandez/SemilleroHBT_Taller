import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionarBebidaComponent } from './nucleo/capa/principal/gestionar-bebida/gestionar-bebida.component';
import { GestionarPlatoComponent } from './nucleo/capa/principal/gestionar-plato/gestionar-plato.component';
import { GestionarClienteComponent } from './nucleo/capa/principal/gestionar-cliente/gestionar-cliente.component';
import { GestionarFacturaComponent } from './nucleo/capa/principal/gestionar-factura/gestionar-factura.component';


const routes: Routes = [
		{   path: 'gestion-bebida',
	    component: GestionarBebidaComponent
  	},
  	{   path: 'gestion-plato',
	    component: GestionarPlatoComponent
  	},
  	{   path: 'gestion-cliente',
	    component: GestionarClienteComponent
    },
    {   path: 'gestion-factura',
	    component: GestionarFacturaComponent
  	},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
