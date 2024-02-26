package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	

	public Tiquete (String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
	this.codigo = codigo;
	this.tarifa = tarifa;
	this.vuelo = vuelo;
	this.cliente = cliente;
	this.usado = usado;
	
	}
	public Cliente getCliente(){
	return cliente;
	
	}
	public Vuelo getVuelo() {
	return vuelo;
	
	}
	public gettarifa() {
		return 0;
	}


}