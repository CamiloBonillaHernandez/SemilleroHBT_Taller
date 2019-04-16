package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de un cliente 
 * @author Camilo Bonilla Hernandez
 *
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	/**
	 * atributo id de cliente
	 */
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "CLIENTE_ID")
	private long idCliente;
	
	/**
	 * Atributo nombre de cliente
	 */
	@Column(name = "CLIENTE_NOMBRE")
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
