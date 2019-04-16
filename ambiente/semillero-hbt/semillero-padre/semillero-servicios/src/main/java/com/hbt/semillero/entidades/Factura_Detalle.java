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
 * Clase que asocia los datos de una Factura en detalle
 * @author Camilo Bonilla Hernandez
 *
 */
@Entity
@Table(name = "FACTURA_DETALLE")
public class Factura_Detalle {
	
	
	/**
	 * atributo id de Factura_Detalle
	 */
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "DETALLE_ID")
	private String idFactura;
	
	/**
	 * atributo idCliente en factura
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FACTURA_ID")
	private Factura factura;
	
	/**
	 * atributo idCliente en factura
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLATO_ID")
	private Plato plato;
	
	/**
	 * atributo idCliente en factura
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BEBIDA_ID")
	private Bebida bebida;
	
	
	/**
	 * atributo precio unitario de factura Detalle
	 */
	@Column(name = "PRECIO_UNITARIO")
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
	public Factura getFactura() {
		return factura;
	}


	/**
	 *
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	/**
	 * @return the plato
	 */
	public Plato getPlato() {
		return plato;
	}


	/**
	 *
	 * @param plato the plato to set
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}


	/**
	 * @return the bebida
	 */
	public Bebida getBebida() {
		return bebida;
	}


	/**
	 *
	 * @param bebida the bebida to set
	 */
	public void setBebida(Bebida bebida) {
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
