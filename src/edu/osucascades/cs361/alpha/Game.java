package edu.osucascades.cs361.alpha;

import java.util.*;
import processing.core.PApplet;

public class Game {

    PApplet p;
    Ship ship;
    Score score;
    int timeBuffer = 0;
    ArrayList<Bomb> bombs = new ArrayList();
    ArrayList<Rocket> rockets = new ArrayList();
    ArrayList<Fort> forts = new ArrayList();
    AlienUFO mothership;

    //Create 2D array for each row of aliens
    ArrayList<ArrayList<Objects>> Aliens = new ArrayList();

    ArrayList<AlienRed> redAliens = new ArrayList();
    ArrayList<AlienYellow> yellowAliens = new ArrayList();
    ArrayList<AlienGreen> greenAliens = new ArrayList();
    ArrayList<AlienBlue> blueAliens = new ArrayList();
    ArrayList<AlienPurple> purpleAliens = new ArrayList();

    public Game (PApplet pApplet){
        // initializes a new game
        p = pApplet;
        ship = new Ship(p);
        score = new Score(p);
        mothership = new AlienUFO(p);
        forts.add(new Fort(p, p.width/10, p.height-p.height/4));
        forts.add(new Fort(p, p.width/3, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/3 - p.width/8, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/10 - p.width/8, p.height-p.height/4));

        for (int i = 0; i < 10; i++) {
            redAliens.add(new AlienRed (p, p.width/4+i*p.width/18, 100));
            yellowAliens.add(new AlienYellow (p, p.width/4+i*p.width/18, 200));
            greenAliens.add(new AlienGreen (p, p.width/4+i*p.width/18, 300));
            blueAliens.add(new AlienBlue (p, p.width/4+i*p.width/18, 400));
            purpleAliens.add(new AlienPurple (p, p.width/4+i*p.width/18, 500));
        }

        // p.fullScreen();
        p.background(55);
    }

    public void update() {
        // update all objects in the game
        timeBuffer -= 1;
        if (p.keyPressed) {
            if (p.key == 'd') {
                ship.moveRight();
            }
            if (p.key == 'a') {
                ship.moveLeft();
            }
            if (p.key == ' ') {
                if (timeBuffer <= 0) {
                // Set time delay between rocket shots
                    rockets.add(new Rocket(p, ship.x, ship.y - ship.p.height/20));
                    timeBuffer = 40;
                }
            }
        }
        // TODO: How do we handle change to alien velocity of an entire row at a single time?

        mothership.move();
    }

    public void draw() {
        // draw all objects in the game
        p.background(55);
        ship.draw();
        score.draw();
        mothership.draw();

        for( Fort fort : forts) {
            fort.draw();
        }

        for( AlienYellow yellowAlien : yellowAliens) {
            yellowAlien.move();
            yellowAlien.draw();
        }

        for( AlienRed redAlien : redAliens) {
            redAlien.move();
            redAlien.draw();
        }

        for( AlienGreen greenAlien : greenAliens) {
            greenAlien.move();
            greenAlien.draw();
        }

        for( AlienBlue blueAlien : blueAliens) {
            blueAlien.move();
            blueAlien.draw();
        }

        for( AlienPurple purpleAlien : purpleAliens) {
            purpleAlien.move();
            purpleAlien.draw();
        }

        for (Rocket rocket : rockets) {
            rocket.move();
            rocket.draw();
        }


    }
}