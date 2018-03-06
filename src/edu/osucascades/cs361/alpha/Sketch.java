package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class Sketch extends PApplet
{
    Ship ship;
    Fort[] forts;

    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        background(55);
        ship = new Ship(this);
        forts = new Fort[4];
        forts[0] = new Fort(this, width/10, height-height/4);
        forts[1] = new Fort(this, width/3, height-height/4);
        forts[2] = new Fort(this, width - width/3 - width/8, height-height/4);
        forts[3] = new Fort(this, width - width/10 - width/8, height-height/4);

    }

    public void draw()
    {
        background(55);
        ship.draw();
        for( Fort fort : forts) {
            fort.draw();
        }
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
