package uniandes.dpoo.taller7.interfaz4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PanelTableroJuego extends JPanel
{

	private static final long serialVersionUID = 1L;
    private int tamano;
    private PanelSuperior panelSuperior;

    public PanelTableroJuego(PanelSuperior __panelSuperior) 
    
    {
        this.panelSuperior = __panelSuperior;
        String tamanoSeleccionado = panelSuperior.getTamanoSeleccionado();
        String[] partes = tamanoSeleccionado.split("x");
        tamano = Integer.parseInt(partes[0]);
        setPreferredSize(new Dimension(500, 500));
    }

    @Override
    protected void paintComponent(Graphics g) 
    
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int cellSize = getWidth() / tamano;
        for (int row = 0; row < tamano; row++) {
            for (int col = 0; col < tamano; col++) {
                int x = col * cellSize;
                int y = row * cellSize;
                g2d.setColor(Color.YELLOW);
                g2d.fillRect(x, y, cellSize, cellSize);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(x, y, cellSize, cellSize);
            }
        }
    }

    public void actualizarTablero() 
    
    {
        if (panelSuperior != null) {
            String tamanoSeleccionado = panelSuperior.getTamanoSeleccionado();
            String[] partes = tamanoSeleccionado.split("x");
            tamano = Integer.parseInt(partes[0]);
            repaint();
        }
    }
	
}
