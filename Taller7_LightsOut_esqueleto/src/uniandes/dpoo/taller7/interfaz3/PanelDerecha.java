package uniandes.dpoo.taller7.interfaz3;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDerecha extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	JButton nuevo;
	JButton reiniciar; 
	JButton top10;
	JButton cambiarJugador;
	
	public PanelDerecha (VentanaPrincipalJuego pPrincipal)
	{
		setLayout(new BorderLayout());
		JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS)); 
        panelBotones.setBorder(new EmptyBorder(50, 10, 10, 10)); 
        botones(panelBotones);
        add(panelBotones, BorderLayout.CENTER); 
	}
	
	public void botones(JPanel panelBotones) {
        nuevo = new JButton("NUEVO");
        reiniciar = new JButton("REINICIAR");
        top10 = new JButton("TOP-10");
        cambiarJugador = new JButton("CAMBIAR JUGADOR");
        Dimension size = new Dimension(Integer.MAX_VALUE,20);
        nuevo.setMaximumSize(size);
        reiniciar.setMaximumSize(size);
        top10.setMaximumSize(size);
        cambiarJugador.setMaximumSize(size);
        panelBotones.add(Box.createVerticalStrut(10)); 
        panelBotones.add(nuevo);
        panelBotones.add(Box.createVerticalStrut(10)); 
        panelBotones.add(reiniciar);
        panelBotones.add(Box.createVerticalStrut(10)); 
        panelBotones.add(top10);
        panelBotones.add(Box.createVerticalStrut(10)); 
        panelBotones.add(cambiarJugador);
    }
	
	

	
	
}
