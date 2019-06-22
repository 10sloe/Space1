import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Kugel
{
    double x;
    double y;
    double vx;
    double vy;
    
    double radius;
    boolean sichtbar;
    Color farbe;
    Rectangle box;

    //Circle symbol;

    Kugel(double x_, double y_)
    {
        sichtbar = false;
        radius = 3;
        x = x_;
        y = y_;
        vx = 0;
        vy = 0;
        farbe = Color.YELLOW;
        box = new Rectangle(x,y,radius*2,radius*2);
    }

    void update()
    {
        y = y + vy;
        box.setX(x);
        box.setY(y);      
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

    double getRadius()
    {
        return radius;
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
            gc.fillOval(x,y,radius*2,radius*2); 
        }
    }

    Rectangle getBox()
    {
        return box;
    }
}

