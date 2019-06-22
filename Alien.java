import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.shape.*;

public class Alien
{
    //Attribute
    double x;
    double y;
    double vx;
    double vy;

    Image img;
    Rectangle box;  

    int zaehler; // zählt die Schritte nach links und die Schritte nach rechts
    double breite = 48;
    double hoehe = 48;

    boolean getroffen; // wurde das Alien getroffen oder nicht?

    //Konstruktor
    public Alien(double x_,double y_)
    {
        zaehler = 0;
        x = x_;
        y = y_;
        vx = 0.4;
        getroffen = false;
        img = new Image("alien1.png", true);
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

    public void update()
    {
        if (getroffen == false)
        {
            zaehler++;
            if (zaehler > 300)
            {
                zaehler = 0;
                vx = -vx;
                y = y + 10;
            }

            x = x + vx;
            box.setX(x);
            box.setY(y);
        }
    }
    // wird aufgerufen, wenn das Alien von einer Kugel getroffen wurde
    public void getroffen()
    {
        getroffen = true;
    }

    public boolean getGetroffen()
    {
        return getroffen;
    }

    Rectangle getBox()
    {
        return box;
    }

    void zeichnen(GraphicsContext gc)
    {
        if(getroffen != true)
        {
            gc.drawImage(img,x, y,breite,hoehe);
        }
    }

}

