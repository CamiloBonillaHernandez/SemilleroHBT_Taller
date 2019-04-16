/**
 * 
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Clase de transferencia que mapea los datos de plato
 * @author Camilo Bonilla Hernandez
 *
 */
public class PlatoDTO implements Serializable {
	
	/**
	 * atributo id de Plato
	 */
	private long idPlato;
	
	/**
	 * atributo nombre de Plato
	 */
	private String nombre;
	
	
	/**
	 * atributo precio de Plato
	 */
	private long precio;
	
	/**
	 * atributo descripcion de plato
	 */
	private String descripcion;



	/**
	 * @return the idPlato
	 */
	public long getIdPlato() {
		return idPlato;
	}


	/**
	 *
	 * @param idPlato the idPlato to set
	 */
	public void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
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


	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 *
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
