package edu.osucascades.cs361.alpha;

import processing.core.PApplet;
import java.lang.*;
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
        background(55);
        fill(255, 255, 0);
        ellipse(width/2, height/2, 100, 100);
        ship.draw();
    }

    public void keyPressed() {
        if (key == 'd') {
            ship.moveRight();
        }
        if (key == 'a') {
            ship.moveLeft();
        }
    }
}
