import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Kugel
{
    double x;
    double y;
    double vx;
    double vy;
    
    double breite;
    double hoehe;
    
    boolean sichtbar;
    Color farbe;


    Kugel(double x_, double y_)
    {
        sichtbar = false;
        breite = 6;
        hoehe = 6;
        x = x_;
        y = y_;
        vx = 0;
        vy = 0;
        farbe = Color.YELLOW;
    }

    void update()
    {
        y = y + vy;   
    }

    void setPosition(double x_, double y_)
    {
        x = x_;
        y = y_;
    }

    void setVy(double vy_)
    {
        vy = vy_;
    }

    void sichtbarMachen()
    {
        sichtbar = true;
    }

    void unsichtbarMachen()
    {
        sichtbar = false;
    }

    void zeichnen(GraphicsContext gc)
    {
        if(sichtbar)
        {
            gc.setFill(farbe);  
            gc.fillOval(x,y,breite,hoehe); 
        }
    }
}

