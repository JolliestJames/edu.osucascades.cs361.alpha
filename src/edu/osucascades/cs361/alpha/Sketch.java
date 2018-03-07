package edu.osucascades.cs361.alpha;
import processing.core.PApplet;
import java.util.*;

public class Sketch extends PApplet
{
    Ship ship;
    ArrayList<Fort> forts = new ArrayList<>();
    ArrayList<AlienRed> redAliens = new ArrayList();
    ArrayList<AlienYellow> yellowAliens = new ArrayList();
    ArrayList<AlienGreen> greenAliens = new ArrayList();
    ArrayList<AlienBlue> blueAliens = new ArrayList();

    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        background(55);
        ship = new Ship(this);
        forts.add(new Fort(this, width/10, height-height/4));
        forts.add(new Fort(this, width/3, height-height/4));
        forts.add(new Fort(this, width - width/3 - width/8, height-height/4));
        forts.add(new Fort(this, width - width/10 - width/8, height-height/4));
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
