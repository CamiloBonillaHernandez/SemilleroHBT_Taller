package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una bebida
 * @author Camilo Bonilla Hernandez
 *
 */

@Entity
@Table(name = "BEBIDA")
@SequenceGenerator(name = "SEQ", sequenceName = "SEQ_COMUN", initialValue = 0, allocationSize = 1)
public class Bebida {
	
	/**
	 * atributo id de bebida
	 */
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "BEBIDA_ID")
	private long idBebida;
	
	/**
	 * atributo nombre de bebida
	 */
	@Column(name = "BEBIDA_NOMBRE")
	private String nombre;
	
	
	/**
	 * atributo precio de bebida
	 */
	@Column(name = "PRECIO")
	private long precio;


	/**
	 * @return the idBebida
	 */
	public long getIdBebida() {
		return idBebida;
	}


	/**
	 *
	 * @param idBebida the idBebida to set
	 */
	public void setIdBebida(long idBebida) {
		this.idBebida = idBebida;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 *
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
