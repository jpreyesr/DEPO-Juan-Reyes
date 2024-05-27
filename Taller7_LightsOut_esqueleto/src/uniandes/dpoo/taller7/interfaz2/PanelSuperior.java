package uniandes.dpoo.taller7.interfaz2;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSuperior extends JPanel{

	JLabel tamano;
	JLabel dificultad;
	JComboBox<String> box;
	JRadioButton facil;
	JRadioButton medio;
	JRadioButton dificil;
	ButtonGroup grupoBotones;
	
	public PanelSuperior(VentanaPrincipalJuego pPrincipal)
	{
		tamano();
		box();
		dificultad();
		botones();
	}
	
	public void tamano()
	{
		tamano = new JLabel("tamaño");
		add(tamano);
	}
	
	public void box()
	{
		box = new JComboBox<>();
		box.addItem("5x5");
		box.addItem("6x6");
		box.addItem("7x7");
		box.addItem("8x8");
		box.addItem("9x9");
		box.addItem("10x10");
		add(box);
	}
	
	public void dificultad()
	{
		dificultad = new JLabel("Dificultad: ");
		add(dificultad);
	}
	
	public void botones()
	{
		grupoBotones = new ButtonGroup();
		facil = new JRadioButton();
		medio = new JRadioButton();
		dificil = new JRadioButton();
		grupoBotones.add(facil);
		grupoBotones.add(medio);
		grupoBotones.add(dificil);
		add(facil);
		add(medio);
		add(dificil);		
	}

}
