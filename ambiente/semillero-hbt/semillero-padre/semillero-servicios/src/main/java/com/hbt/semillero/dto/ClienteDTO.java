/**
 * 
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Clase de transferencia que mapea los datos de Cliente
 * @author Camilo Bonilla Hernandez
 *
 */
public class ClienteDTO implements Serializable {
	
	/**
	 * Atributo serialVersionUID de la clase
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * atributo id de cliente
	 */
	private long idCliente;
	
	/**
	 * Atributo nombre de cliente
	 */
	private String nombre ;

	/**
	 * @return the idCliente
	 */
	public long getIdCliente() {
		return idCliente;
	}

	/**
	 *
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
	
	
	

}
