package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInferior extends JPanel
{
	private static final long serialVersionUID = 1L;
	JLabel jugadas;
	JTextField cero;
	JLabel jugador;
	JTextField nombre;
	public PanelInferior(VentanaPrincipalJuego pPrincipal)
	{
		jugadas();
		jugador();
		nombre();
		cero();

	
	}
	public void jugadas() 
	{
		jugadas= new JLabel("Jugadas: ");
		 add(jugadas);
	}
	
	public void jugador() 
	{
		jugador= new JLabel("Jugador: ");
		 add(jugador);
	}
	public void nombre() 
	{
		nombre = new JTextField(10);
		 add(nombre);
	}
	public void cero() 
	{
		cero = new JTextField(10);
		cero.setText("0");
		 add(cero);
	}

}
