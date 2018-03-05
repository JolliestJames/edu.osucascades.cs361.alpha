package edu.osucascades.cs361.alpha;

import processing.core.PApplet;
//import edu.osucascades.cs361.alpha.Ship;

public class Sketch extends PApplet
{
    Ship ship;

    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        background(55);
        ship = new Ship(this);
    }

    public void draw()
    {
        fill(255, 255, 0);
        ellipse(width/2, height/2, 100, 100);
        drawJamesCircle();
        drawLeoCircle();
        drawNathanCircle();
        ship.draw();
    }

    private void drawJamesCircle()
    {
        fill(220, 220, 125);
        ellipse(width/4, height/4, 150, 150);
    }

    private void drawLeoCircle()
    {
        fill(0,0,255);
        ellipse(width - width/8, height/8, 75, 75);
    }

    private void drawNathanCircle()
    {
        fill(180, 180, 108);
        ellipse(width-150, height-150, 100, 100);
    }
}
