/**
 * 
 */
package com.hbt.semillero.servicios.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal;

/**
 * Clase que expone servicios Rest
 * @author Camilo Bonilla Hernandez
 *
 */
@Path("/ConsultasRest")
public class ConsultasRest {
	
	/**
	 * EJB que permite hacer consultas
	 */
	@EJB
	private IConsultasEJBLocal consultaEJB;

	/**
	 * Consulta las Bebidas existentes en el sistema.
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarBebidas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BebidaDTO> consultarBebidas() {
		return consultaEJB.consultarBebidas();
	}
	
	/**
	 * Consulta Los Platos existentes en el sistema.
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarPlatos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PlatoDTO> consultarPlatos() {
		return consultaEJB.consultarPlatos();
	}
	
	/**
	 * Consulta Los clientes existentes en el sistema.
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteDTO> consultarClientes() {
		return consultaEJB.consultarCLiente();
	}
	
	/**
	 * Consulta las Facturas existentes en el sistema.
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarFacturas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDTO> consultarFacturas() {
		return consultaEJB.consultarFactura();
	}
	
	
	/**
	 * Consulta las Facturas en detalle existentes en el sistema.
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarFacturasDetalle")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDetalleDTO> consultarFacturasDetalle() {
		return consultaEJB.consultarFacturaDetalle();
	}
	
	/**
	 * insert de bebida
	 * @param bebidaDTO
	 * @return
	 */
	@POST
	@Path("/crearBebida")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO) {
		return consultaEJB.crearBebida(bebidaDTO);
	}
	

	/**
	 * insert de Plato
	 * @param bebidaDTO
	 * @return
	 */
	@POST
	@Path("/crearPlato")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearPlato(PlatoDTO platoDTO) {
		return consultaEJB.crearPlato(platoDTO);
	}
	

	/**
	 * insert de Cliente
	 * @param bebidaDTO
	 * @return
	 */
	@POST
	@Path("/crearCliente")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO) {
		return consultaEJB.crearCliente(clienteDTO);
	}
}
