/**
 * 
 */
package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;


/**
 * interfaz que permite exponer los metodos de EJB de consultasEJB
 * @author Camilo Bonilla Hernandez
 *
 */
public interface IConsultasEJBLocal {
	
	
	/**
	 * Consulta las Bebidas existentes en el sistema.
	 * 
	 * @return
	 */
	public List<BebidaDTO> consultarBebidas();
	
	/**
	 * Consulta los Platos existentes en el sistema
	 * @return
	 */
	
	public List<PlatoDTO> consultarPlatos();
	
	/**
	 * Consulta los clientes creados en el sistema
	 * @return
	 */
	
	public List<ClienteDTO> consultarCLiente();
	
	/**
	 * consulta las facturas generadas por el sistema
	 * @return
	 */
	
	public List<FacturaDTO> consultarFactura();
	
	
	/**
	 * consulta el detalle de una factura generada en el sistema
	 * @return
	 */
	
	public List<FacturaDetalleDTO> consultarFacturaDetalle();
	
	/**
	 * insert de bebida
	 * @param bebidaDTO
	 * @return
	 */
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO);
	
	/**
	 * insert de  Plato
	 * @param platoDTO
	 * @return
	 */
	public ResultadoDTO crearPlato(PlatoDTO platoDTO);
	
	/**
	 * insert de Cliente
	 * @param clienteDTO
	 * @return
	 */
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO);
	
	

}
