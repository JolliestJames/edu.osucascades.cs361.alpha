package edu.osucascades.cs361.alpha;

import java.util.*;
import processing.core.PApplet;

public class Game {

    PApplet p;
    Ship ship;
    ArrayList<Fort> forts = new ArrayList();
    ArrayList<AlienRed> redAliens = new ArrayList();
    ArrayList<AlienYellow> yellowAliens = new ArrayList();
    ArrayList<AlienGreen> greenAliens = new ArrayList();
    ArrayList<AlienBlue> blueAliens = new ArrayList();
    ArrayList<AlienPurple> purpleAliens = new ArrayList();

    public Game (PApplet pApplet){
        // initializes a new game
        p = pApplet;
        ship = new Ship(p);
        forts.add(new Fort(p, p.width/10, p.height-p.height/4));
        forts.add(new Fort(p, p.width/3, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/3 - p.width/8, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/10 - p.width/8, p.height-p.height/4));

        for (int i = 0; i < 10; i++) {
            redAliens.add(new AlienRed (p, 100+i*100, 100));
            yellowAliens.add(new AlienYellow (p, 100+i*100, 200));
            greenAliens.add(new AlienGreen (p, 100+i*100, 300));
            blueAliens.add(new AlienBlue (p, 100+i*100, 400));
            purpleAliens.add(new AlienPurple (p, 100+i*100, 500));
        }

//        p.fullScreen();
        p.background(55);
    }

    public void update() {
        // update all objects in the game
        if (p.keyPressed) {
            if (p.key == 'd') {
                ship.moveRight();
            }
            if (p.key == 'a') {
                ship.moveLeft();
            }
        }
        //TODO: move each alien to the right left depending on direction flag
    }

    public void draw() {
        // draw all objects in the game
        p.background(55);
        ship.draw();

        for( Fort fort : forts) {
            fort.draw();
        }
        for( AlienYellow yellowAlien : yellowAliens) {
            yellowAlien.draw();
        }

        for( AlienRed redAlien : redAliens) {
            redAlien.draw();
        }

        for( AlienGreen greenAlien : greenAliens) {
            greenAlien.draw();
        }

        for( AlienBlue blueAlien : blueAliens) {
            blueAlien.draw();
        }

        for( AlienPurple purpleAlien : purpleAliens) {
            purpleAlien.draw();
        }
    }
}