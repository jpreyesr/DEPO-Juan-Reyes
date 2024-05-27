package uniandes.dpoo.taller7.interfaz2;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaPrincipalJuego extends JFrame{

	private PanelSuperior panelSuperior;
	private PanelDerecha panelDerecha;
	private PanelInferior panelInferior;
	
	
	public VentanaPrincipalJuego() throws Exception {
		 setTitle("Juego de LightsOut");
		 setSize(800, 600);
		 setLocationRelativeTo(null);
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 
		 // Panel de arriba
		 
		 JPanel arriba = new JPanel();
		 arriba.setLayout(new GridLayout (1, 6, 700, 10));
		 add(arriba, BorderLayout.NORTH);
		 panelSuperior = new PanelSuperior(this);
		 arriba.add( panelSuperior );
		 
		 // Panel de la derecha 
		 
		 JPanel derecha = new JPanel();
		 derecha.setLayout(new BorderLayout ());
		 add(derecha, BorderLayout.EAST);
		 panelDerecha = new PanelDerecha(this);
		 derecha.add( panelSuperior, BorderLayout.EAST );
		 
		 JPanel abajo = new JPanel( );
		 abajo.setLayout( new GridLayout(1,4,700,10));
		 add( abajo, BorderLayout.SOUTH);
		 panelInferior = new PanelInferior(this);
		 abajo.add(panelInferior);
	}
	public static void main (String[] pArgs) throws Exception
	{
		
        VentanaPrincipalJuego ventana = new VentanaPrincipalJuego( );
        ventana.setVisible(true);
	}

}
