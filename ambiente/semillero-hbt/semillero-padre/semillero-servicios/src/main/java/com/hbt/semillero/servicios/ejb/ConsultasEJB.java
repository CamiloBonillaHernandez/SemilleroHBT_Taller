/**
 * 
 */
package com.hbt.semillero.servicios.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.CipherInputStream;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.Factura_Detalle;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal;

/**
 * EJB de consultas
 * @author Camilo Bonilla Hernandez
 *
 */
@Stateless
public class ConsultasEJB implements IConsultasEJBLocal {
	
	@PersistenceContext
	private EntityManager entityManager;

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#consultarBebidas()
	 */
	@Override
	public List<BebidaDTO> consultarBebidas() {
		List<Bebida> bebidas = entityManager.createQuery("Select be from Bebida be").getResultList();
		List<BebidaDTO> bebidasResult= new ArrayList<>();
		for (Bebida bebida: bebidas) {
			BebidaDTO bebidaDTO = construirBebida(bebida);
			bebidasResult.add(bebidaDTO);
		}
		return bebidasResult;
	}

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#consultarPlatos()
	 */
	@Override
	public List<PlatoDTO> consultarPlatos() {
		List<Plato> platos = entityManager.createQuery("Select pl from Plato pl").getResultList();
		List<PlatoDTO> platosResult= new ArrayList<>();
		for (Plato plato: platos) {
			PlatoDTO platoDTO = construirPlato(plato);
			platosResult.add(platoDTO);
		}
		return platosResult;
	}

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#consultarCLiente()
	 */
	@Override
	public List<ClienteDTO> consultarCLiente() {
		List<Cliente> clientes = entityManager.createQuery("Select cl from Cliente cl").getResultList();
		List<ClienteDTO> clientesResult = new ArrayList<>();
		for (Cliente cliente : clientes) {
			ClienteDTO clienteDTO = constuirCliente(cliente);
			clientesResult.add(clienteDTO);
		}
		return clientesResult;
	}

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#consultarFactura()
	 */
	@Override
	public List<FacturaDTO> consultarFactura() {
		List<Factura> facturas = entityManager.createQuery("Select fa from Factura fa").getResultList();
		List<FacturaDTO> facturasResult = new ArrayList<>();
		for (Factura factura: facturas) {
			FacturaDTO facturaDTO = constriurFactura(factura);
			facturasResult.add(facturaDTO);
		}
		return facturasResult;
	}

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#consultarFacturaDetalle()
	 */
	@Override
	public List<FacturaDetalleDTO> consultarFacturaDetalle() {
		List<Factura_Detalle> facturasDetalle =  entityManager.createQuery("Select fd from Factura_Detalle fd").getResultList();
		List<FacturaDetalleDTO> resultFacturaDetalle = new ArrayList<>();
		for (Factura_Detalle facturaDetalle : facturasDetalle) {
			FacturaDetalleDTO facturaDetalleDTO = construirFacturaDetalle(facturaDetalle);
			resultFacturaDetalle.add(facturaDetalleDTO);
		}
		return resultFacturaDetalle;
	}
	
	
	/**
	 * Construye un DTO de bebidaDTO
	 * @param bebida
	 * @return
	 */
	
	public BebidaDTO construirBebida(Bebida bebida) {
		BebidaDTO bebidaDTO = new BebidaDTO();
		bebidaDTO.setIdBebida(bebida.getIdBebida());
		bebidaDTO.setNombre(bebida.getNombre());
		bebidaDTO.setPrecio(bebida.getPrecio());
		return bebidaDTO;
	}
	
	
	/**
	 * Construye un DTO de PlatoDTO
	 * @param bebida
	 * @return
	 */
	
	public PlatoDTO construirPlato(Plato plato) {
		PlatoDTO platoDTO = new PlatoDTO();
		platoDTO.setIdPlato(plato.getIdPlato());
		platoDTO.setNombre(plato.getNombre());
		platoDTO.setPrecio(plato.getPrecio());
		platoDTO.setDescripcion(plato.getDescripcion());
		return platoDTO;
	}
	
	/**
	 * Construye un DTO de clienteDTO
	 * @param cliente
	 * @return
	 */
	
	public ClienteDTO constuirCliente(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setIdCliente(cliente.getIdCliente());
		clienteDTO.setNombre(cliente.getNombre());
		return clienteDTO;
		
	}
	
	/**
	 * Construye un DTO de Factura
	 * @param factura
	 * @return
	 */
	
	public FacturaDTO constriurFactura(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		facturaDTO.setIdFactura(factura.getIdFactura());
		facturaDTO.setCliente(constuirCliente(factura.getIdCliente()));
		facturaDTO.setIva(factura.getIva());
		facturaDTO.setTotal(factura.getTotal());
		return facturaDTO;
	}
	/**
	 * construye un DTO de FacturaDetalle
	 * @return
	 */
	public FacturaDetalleDTO construirFacturaDetalle(Factura_Detalle facturaDetalle) {
		FacturaDetalleDTO facturaDetalleDTO = new FacturaDetalleDTO();
		facturaDetalleDTO.setIdFactura(facturaDetalle.getIdFactura());
		facturaDetalleDTO.setFactura(constriurFactura(facturaDetalle.getFactura()));
		facturaDetalleDTO.setBebida(construirBebida(facturaDetalle.getBebida()));
		facturaDetalleDTO.setPlato(construirPlato(facturaDetalle.getPlato()));
		facturaDetalleDTO.setPrecio(facturaDetalle.getPrecio());
		return facturaDetalleDTO;
	}

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#crearBebida(com.hbt.semillero.dto.BebidaDTO)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearBebida(BebidaDTO bebidaDTO) {
		Bebida bebida = insertBebida(bebidaDTO);
		try {
			entityManager.persist(bebida);
		}catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "Creado exitosamente");
	}
	
	/**
	 * Metodo que permite crear una bebida para insrtarla a base de datos
	 * @param bebidaDTO
	 * @return
	 */
	public Bebida insertBebida(BebidaDTO bebidaDTO) {
		Bebida bebida = new Bebida();
		bebida.setIdBebida(bebidaDTO.getIdBebida());
		bebida.setNombre(bebidaDTO.getNombre());
		bebida.setPrecio(bebidaDTO.getPrecio());
		return bebida;
	}
	

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#crearPlato(com.hbt.semillero.dto.PlatoDTO)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearPlato(PlatoDTO platoDTO) {
		Plato plato = insertPlato(platoDTO);
		try {
			entityManager.persist(plato);
		}catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "Creado exitosamente");
	}
	
	
	/**
	 * Metodo que permite crear un plato para insrtarlo a base de datos
	 * @param bebidaDTO
	 * @return
	 */
	public Plato insertPlato(PlatoDTO platoDTO) {
		Plato plato = new Plato();
		plato.setIdPlato(platoDTO.getIdPlato());
		plato.setNombre(platoDTO.getNombre());
		plato.setDescripcion(platoDTO.getDescripcion());
		plato.setPrecio(platoDTO.getPrecio());
		return plato;
	}

	/* 
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasEJBLocal#crearCliente(com.hbt.semillero.dto.ClienteDTO)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearCliente(ClienteDTO clienteDTO) {
		Cliente cliente = insertCliente(clienteDTO);
		try {
			entityManager.persist(cliente);
		}catch (Exception e) {
			return new ResultadoDTO(false, e.getMessage());
		}

		return new ResultadoDTO(true, "Creado exitosamente");
	}
	
	/**
	 * Metodo que permite crear un cliente insrtarlo a base de datos
	 * @param bebidaDTO
	 * @return
	 */
	public Cliente insertCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(clienteDTO.getIdCliente());
		cliente.setNombre(clienteDTO.getNombre());
		return cliente;
	}
	

}
