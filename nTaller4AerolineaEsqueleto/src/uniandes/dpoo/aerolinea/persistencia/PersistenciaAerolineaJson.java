package uniandes.dpoo.aerolinea.persistencia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {
	
	public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException{
		JSONObject jobject= new JSONOobject();
		salvarAerolinea (aerolinea, jobject);
		cargarTiquetes (aerolinea, jobject);
		
		PrintWriter pw = new PrintWriter (archivo);
		jobject.write(pw, 2, 0);
		pw.close();
		
	}
	public void salvarAerolinea (Aerolinea aerolinea, JSONOobject jobject)
	{
		JSONArray jvuelos = new JSONArray();
		JSONArray jAviones = new JSONArray();
		JSONArray jrutas = new JSONArray();
		
		for (Vuelo vuelo : aerolinea.getVuelos())
		{
			JSONObject jVuelo = new JSONObject();
			
			jVuelo.put ("Ruta", vuelo.getRuta());
			jVuelo.put ("Avion", vuelo.getAvion());	
			jVuelo.put ("Fecha", vuelo.getFecha());
			
			JSONArray jTiquetes =new JSONArray();
			for (Tiquete tiquete : vuelo.getTiquetes());
				JSONObject jTiquete = new JSONObject();
				
				jTiquete.put (tiquete.getCodigo(), tiquete);
				jTiquete.put (jTiquete);
				
		}
		
		jvuelos.put ("tiquetes", jTiquetes);
		jvuelos.put (jVuelo);

	}
	
	

}