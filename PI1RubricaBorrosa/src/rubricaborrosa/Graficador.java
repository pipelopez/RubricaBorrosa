package rubricaborrosa;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.*;

public class Graficador
{
    private BufferedImage zonaDibujo;
    
    private int ancho = 200;
    private int alto = 100;
    
    private Font fuente = new Font("Roman", 1, 16);
    
    public Graficador()
    {
        zonaDibujo = new BufferedImage(ancho, alto,BufferedImage.TYPE_INT_ARGB);
        Graphics2D AreaDibujo = (Graphics2D) zonaDibujo.getGraphics();
        
        AreaDibujo.setColor(Color.white);
        AreaDibujo.fillRect(0,0,ancho, alto);
        
        AreaDibujo.dispose();
    }
    
    
}