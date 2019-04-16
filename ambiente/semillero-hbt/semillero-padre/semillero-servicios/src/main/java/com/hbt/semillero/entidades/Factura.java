package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una factura
 * @author Camilo Bonilla Hernandez
 *
 */
@Entity
@Table(name = "FACTURA")
public class Factura {
	
	
	/**
	 * atributo id de Factura
	 */
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "FACTURA_ID")
	private long idFactura;
	
	
	/**
	 * atributo idCliente en factura
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente cliente;
	
	
	/**
	 * atributo iva de factura
	 */
	@Column(name = "IVA")
	private long iva;
	
	/**
	 * atributo totatl de factura
	 */
	@Column(name = "TOTAL")
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
	 * @return the idCliente
	 */
	public Cliente getIdCliente() {
		return cliente;
	}

	/**
	 *
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Cliente cliente) {
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
