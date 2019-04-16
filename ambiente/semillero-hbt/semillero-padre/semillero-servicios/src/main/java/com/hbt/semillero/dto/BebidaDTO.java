/**
 * 
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Clase de transferencia para mapear los datos de Bebida
 * @author Camilo Bonilla Hernandez
 *
 */
public class BebidaDTO  implements Serializable{

	/**
	 * Atributo serialVersionUID de la clase
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * atributo id de bebida
	 */
	private long idBebida;
	
	/**
	 * atributo nombre de bebida
	 */
	private String nombre;
	
	
	/**
	 * atributo precio de bebida
	 */
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
