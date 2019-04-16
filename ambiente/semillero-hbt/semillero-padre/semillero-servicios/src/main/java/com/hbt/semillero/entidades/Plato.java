package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de un plato.
 * @author Camilo Bonilla Hernandez
 *
 */
@Entity
@Table(name = "PLATO")
public class Plato {
	
	/**
	 * atributo id de Plato
	 */
	@Id
	@GeneratedValue (generator = "SEQ")
	@Column(name = "PLATO_ID")
	private long idPlato;
	
	/**
	 * atributo nombre de Plato
	 */
	@Column(name = "PLATO_NOMBRE")
	private String nombre;
	
	
	/**
	 * atributo precio de Plato
	 */
	@Column(name = "PRECIO")
	private long precio;

	

	/**
	 * atributo descripcion de plato
	 */
	@Column(name = "PLATO_DESCRIPCION")
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
