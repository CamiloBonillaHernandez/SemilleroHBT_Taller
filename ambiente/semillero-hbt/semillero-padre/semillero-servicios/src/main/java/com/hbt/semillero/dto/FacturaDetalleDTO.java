/**
 * 
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.Plato;

/**
 * Clase de transferencia que mapea los datos de factura Detalle
 * @author Camilo Bonilla Hernandez
 *
 */
public class FacturaDetalleDTO implements Serializable {
	
	/**
	 * Atributo serialVersionUID de la clase
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * atributo id de Factura_Detalle
	 */
	private String idFactura;
	
	/**
	 * atributo idCliente en factura
	 */
	private FacturaDTO factura;
	
	/**
	 * atributo idCliente en factura
	 */
	private PlatoDTO plato;
	
	/**
	 * atributo idCliente en factura
	 */
	private BebidaDTO bebida;
	
	
	/**
	 * atributo precio unitario de factura Detalle
	 */
	private long precio;


	/**
	 * @return the idFactura
	 */
	public String getIdFactura() {
		return idFactura;
	}


	/**
	 *
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}


	/**
	 * @return the factura
	 */
	public FacturaDTO getFactura() {
		return factura;
	}


	/**
	 *
	 * @param factura the factura to set
	 */
	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}


	/**
	 * @return the plato
	 */
	public PlatoDTO getPlato() {
		return plato;
	}


	/**
	 *
	 * @param plato the plato to set
	 */
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}


	/**
	 * @return the bebida
	 */
	public BebidaDTO getBebida() {
		return bebida;
	}


	/**
	 *
	 * @param bebida the bebida to set
	 */
	public void setBebida(BebidaDTO bebida) {
		this.bebida = bebida;
	}


	/**
	 * @return the precio
	 */
	public long getPrecio() {
		return precio;
	}


	/**
	 *
	 * @param precio the precio to set
	 */
	public void setPrecio(long precio) {
		this.precio = precio;
	}


	

}
