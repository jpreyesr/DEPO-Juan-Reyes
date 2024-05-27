package uniandes.dpoo.taller7.interfaz1;
import javax.swing.*;

public class VentanaPrincipalJuego extends JFrame{

	public VentanaPrincipalJuego() throws Exception {
		 setTitle("Juego de LightsOut");
		 setSize(800, 600);
		 setLocationRelativeTo(null);
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
	}
	public static void main (String[] pArgs) throws Exception
	{
		
        VentanaPrincipalJuego ventana = new VentanaPrincipalJuego( );
        ventana.setVisible(true);
	}

}
