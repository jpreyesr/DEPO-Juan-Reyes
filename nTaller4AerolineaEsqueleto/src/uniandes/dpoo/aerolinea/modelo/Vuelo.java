package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map <String, Tiquete> tiquetes;
	
	public Vuelo (Ruta ruta, String fecha, Avion avion) {
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;	
		this.tiquetes = new HashMap<>();
	}
	public Ruta getRuta() {
		return ruta;
	}
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return avion;
	}
	public Collection <Tiquete> getTiquetes(){
		return tiquetes.values();
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{
		
		Map mapaTiquetes = tiquetes;
		for (Map.Entry<String, Tiquete> key : tiquetes.entrySet()) {
			if 
		}
		
		return cantidad;
		
	}
	public boolean equals (Object obj)
	{
		return true;
	}
}
