package edu.osucascades.cs361.alpha;

import java.util.*;
import processing.core.PApplet;

public class Game {

    PApplet p;
    Ship ship;
    Score score;
    int timeBuffer = 0;
    int alienMoveTime = 0;
    ArrayList<Bomb> bombs = new ArrayList();
    ArrayList<Rocket> rockets = new ArrayList();
    ArrayList<Fort> forts = new ArrayList();
    AlienUFO mothership;

    //Create 2D array for each row of aliens
    ArrayList<ArrayList<Objects>> Aliens = new ArrayList();

    ArrayList<RedAlien> redAliens = new ArrayList();
    ArrayList<YellowAlien > yellowAliens = new ArrayList();
    ArrayList<GreenAlien> greenAliens = new ArrayList();
    ArrayList<BlueAlien> blueAliens = new ArrayList();
    ArrayList<PurpleAlien> purpleAliens = new ArrayList();

    public Game (PApplet pApplet){
        p = pApplet;
        ship = new Ship(p);
        score = new Score(p);
        mothership = new AlienUFO(p);
        forts.add(new Fort(p, p.width/10, p.height-p.height/4));
        forts.add(new Fort(p, p.width/3, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/3 - p.width/8, p.height-p.height/4));
        forts.add(new Fort(p, p.width - p.width/10 - p.width/8, p.height-p.height/4));

        for (int i = 0; i < 10; i++) {
            redAliens.add(new RedAlien (p, p.width/4+i*p.width/18, 100));
            yellowAliens.add(new YellowAlien (p, p.width/4+i*p.width/18, 200));
            greenAliens.add(new GreenAlien (p, p.width/4+i*p.width/18, 300));
            blueAliens.add(new BlueAlien (p, p.width/4+i*p.width/18, 400));
            purpleAliens.add(new PurpleAlien (p, p.width/4+i*p.width/18, 500));
        }

        p.background(55);
    }

    public void update() {
        // update all objects in the game
        timeBuffer -= 1;
        alienMoveTime += 1;
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

        if (alienMoveTime == 40) {

            for (YellowAlien yellowAlien: yellowAliens) {
                if (yellowAliens.get(yellowAliens.size() - 1).x > p.width - p.width / 50) {
                    yellowAlien.changeVelocity();
                    yellowAlien.moveDown();
                } else if (yellowAliens.get(0).x < p.width / 50) {
                    yellowAlien.changeVelocity();
                    yellowAlien.moveDown();
                }
            }

            for (YellowAlien yellowAlien : yellowAliens) {yellowAlien.move();}
        }

        if (alienMoveTime == 35) {
            for (RedAlien redAlien: redAliens) {
                if (redAliens.get(redAliens.size() - 1).x > p.width - p.width / 50) {
                    redAlien.changeVelocity();
                    redAlien.moveDown();
                } else if (redAliens.get(0).x < p.width / 50) {
                    redAlien.changeVelocity();
                    redAlien.moveDown();
                }
            }

            for (RedAlien redAlien : redAliens) { redAlien.move(); }
        }

        if (alienMoveTime == 45) {
            for (GreenAlien greenAlien : greenAliens) {
                if (greenAliens.get(greenAliens.size() - 1).x > p.width - p.width / 50) {
                    greenAlien.changeVelocity();
                    greenAlien.moveDown();
                } else if (greenAliens.get(0).x < p.width / 50) {
                    greenAlien.changeVelocity();
                    greenAlien.moveDown();
                }
            }

            for (GreenAlien greenAlien : greenAliens) { greenAlien.move(); }
        }

        if (alienMoveTime == 50) {
            for (BlueAlien blueAlien : blueAliens) {
                if (blueAliens.get(blueAliens.size() - 1).x > p.width - p.width / 50) {
                    blueAlien.changeVelocity();
                    blueAlien.moveDown();
                } else if (blueAliens.get(0).x < p.width / 50) {
                    blueAlien.changeVelocity();
                    blueAlien.moveDown();
                }
            }

            for (BlueAlien blueAlien : blueAliens) { blueAlien.move(); }
        }

        if (alienMoveTime == 55) {
            for (PurpleAlien purpleAlien : purpleAliens) {
                if (purpleAliens.get(purpleAliens.size() - 1).x > p.width - p.width / 50) {
                    purpleAlien.changeVelocity();
                    purpleAlien .moveDown();
                } else if (purpleAliens.get(0).x < p.width / 50) {
                    purpleAlien.changeVelocity();
                    purpleAlien.moveDown();
                }
            }

            for (PurpleAlien purpleAlien : purpleAliens) {purpleAlien.move();}
        }

        if (alienMoveTime >= 55) {
            alienMoveTime = 0;
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

        for (YellowAlien yellowAlien : yellowAliens) {
            yellowAlien.draw();
        }

        for (RedAlien redAlien : redAliens) {
            redAlien.draw();
        }

        for (GreenAlien greenAlien : greenAliens) {
            greenAlien.draw();
        }

        for (BlueAlien blueAlien : blueAliens) {
            blueAlien.draw();
        }

        for (PurpleAlien purpleAlien : purpleAliens) {
            purpleAlien.draw();
        }

        if (alienMoveTime >= 55) {
            alienMoveTime = 0;
        }


        for (Rocket rocket : rockets) {
            rocket.move();
            rocket.draw();
        }


    }
}