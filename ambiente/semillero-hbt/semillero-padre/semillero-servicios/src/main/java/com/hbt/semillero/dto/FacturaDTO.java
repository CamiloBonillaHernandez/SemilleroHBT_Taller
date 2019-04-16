/**
 * 
 */
package com.hbt.semillero.dto;


import java.io.Serializable;

import com.hbt.semillero.entidades.Cliente;

/**
 * Clase de transferencia que mapea los datos de Factura
 * @author Camilo Bonilla Hernandez
 *
 */
public class FacturaDTO implements Serializable{
	
	/**
	 * Atributo serialVersionUID de la clase
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * atributo id de Factura
	 */
	private long idFactura;
	
	
	/**
	 * atributo idCliente en factura
	 */
	private ClienteDTO cliente;
	
	
	/**
	 * atributo iva de factura
	 */
	private long iva;
	
	/**
	 * atributo totatl de factura
	 */
	private long total;

	/**
	 * @return the idFactura
	 */
	public long getIdFactura() {
		return idFactura;
	}

	/**
	 *
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	

	/**
	 * @return the cliente
	 */
	public ClienteDTO getCliente() {
		return cliente;
	}

	/**
	 *
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the iva
	 */
	public long getIva() {
		return iva;
	}

	/**
	 *
	 * @param iva the iva to set
	 */
	public void setIva(long iva) {
		this.iva = iva;
	}

	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}

	/**
	 *
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}


	
	
}
