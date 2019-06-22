import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

public class Schiff
{
    //Attribute
    double x;
    double y;
    double vx;
    double vy;

    double breite = 48;
    double hoehe = 48;

    Image img;
    Rectangle box;    

    //Konstruktor
    public Schiff(double x_,double y_)
    {
        x = x_;
        y = y_;
        vx = 0;
        vy = 0;
        img = new Image("schiff.png", true);
        box = new Rectangle(x,y,breite,hoehe);

    }

    //Methoden

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getBreite()
    {
        return breite;
    }

    public void setPosition(double x_, double y_)
    {
        x = x_;
        y = y_;
    }

    public void nachRechts()
    {
        vx = 3;
    }

    public void nachLinks()
    {
        vx = -3;
    }

    public void update()
    {
        x = x + vx;
    }

    public void stoppen()
    {
        vx = 0;
    }

    void zeichnen(GraphicsContext gc)
    {
        gc.drawImage(img,x, y,breite,hoehe);
    }

}
