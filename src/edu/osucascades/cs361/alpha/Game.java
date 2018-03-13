package edu.osucascades.cs361.alpha;

import java.util.*;
import processing.core.PApplet;

public class Game {

    PApplet p;
    Ship ship;
    Score score;
    int timeBuffer = 0;
    int fleetSignal = 0;

    ArrayList<Bomb> bombs = new ArrayList();
    ArrayList<Rocket> rockets = new ArrayList();
    ArrayList<Fort> forts = new ArrayList();
    AlienUFO mothership;

    private AlienArmada armada;
    private Fleet redFleet;
    private Fleet yellowFleet;
    private Fleet greenFleet;
    private Fleet blueFleet;
    private Fleet purpleFleet;

    public Game (PApplet pApplet){

        p = pApplet;
        ship = new Ship(p);
        score = new Score(p);
        mothership = new AlienUFO(p);

        armada = new AlienArmada(p);
        redFleet = new Fleet(p, 35);
        yellowFleet = new Fleet(p, 40);
        greenFleet = new Fleet(p, 45);
        blueFleet = new Fleet(p, 50);
        purpleFleet = new Fleet(p, 55);

        forts.add(new Fort(p, p.width/10, p.height-p.height/4));
        forts.add(new Fort(p, p.width/3, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/3 - p.width/8, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/10 - p.width/8, p.height-p.height/4));

        for (int i = 0; i < 10; i++) {
            redFleet.addAlien(new RedAlien (p, p.width/4+i*p.width/18, 100));
            yellowFleet.addAlien(new YellowAlien (p, p.width/4+i*p.width/18, 200));
            greenFleet.addAlien(new GreenAlien (p, p.width/4+i*p.width/18, 300));
            blueFleet.addAlien(new BlueAlien (p, p.width/4+i*p.width/18, 400));
            purpleFleet.addAlien(new PurpleAlien (p, p.width/4+i*p.width/18, 500));
        }

        armada.addFleet(redFleet);
        armada.addFleet(yellowFleet);
        armada.addFleet(greenFleet);
        armada.addFleet(blueFleet);
        armada.addFleet(purpleFleet);

        p.background(55);
    }

    public void update() {
        // update all objects in the game
        timeBuffer -= 1;
        fleetSignal += 1;

        if (p.keyPressed) {
            if (p.key == 'd') {
                ship.moveRight();
            }
            if (p.key == 'a') {
                ship.moveLeft();
            }
            if (p.key == ' ' && timeBuffer <= 0) {
                // Set time delay between rocket shots
                rockets.add(new Rocket(p, ship.x, ship.y - ship.p.height/20));
                timeBuffer = 40;
            }
        }

        armada.moveFleets(fleetSignal);

        if (fleetSignal >= 55) {
            fleetSignal = 0;
        }

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

        armada.drawFleets();

        for (Rocket rocket : rockets) {
            rocket.move();
            rocket.draw();
        }
    }
}