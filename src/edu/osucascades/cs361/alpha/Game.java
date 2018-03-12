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

    ArrayList<AlienRed> redAliens = new ArrayList();
    ArrayList<AlienYellow> yellowAliens = new ArrayList();
    ArrayList<AlienGreen> greenAliens = new ArrayList();
    ArrayList<AlienBlue> blueAliens = new ArrayList();
    ArrayList<AlienPurple> purpleAliens = new ArrayList();

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
            redAliens.add(new AlienRed (p, p.width/4+i*p.width/18, 100));
            yellowAliens.add(new AlienYellow (p, p.width/4+i*p.width/18, 200));
            greenAliens.add(new AlienGreen (p, p.width/4+i*p.width/18, 300));
            blueAliens.add(new AlienBlue (p, p.width/4+i*p.width/18, 400));
            purpleAliens.add(new AlienPurple (p, p.width/4+i*p.width/18, 500));
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
            if (p.key == ' ') {
                if (timeBuffer <= 0) {
                // Set time delay between rocket shots
                    rockets.add(new Rocket(p, ship.x, ship.y - ship.p.height/20));
                    timeBuffer = 40;
                }
            }
        }
        // TODO: How do we handle change to alien velocity of an entire row at a single time?

        if (alienMoveTime == 40) {
            for (AlienYellow yellowAlien: yellowAliens) {
                if (yellowAliens.get(yellowAliens.size() - 1).x > p.width - p.width / 50) {
                    yellowAlien.changeVelocity();
                    yellowAlien.moveDown();
                } else if (yellowAliens.get(0).x < p.width / 50) {
                    yellowAlien.changeVelocity();
                    yellowAlien.moveDown();
                }
            }
        }

        if(alienMoveTime == 40) {
            for (AlienYellow yellowAlien : yellowAliens) {yellowAlien.move();}
        }

        if (alienMoveTime == 35) {
            for (AlienRed redAlien: redAliens) {
                if (redAliens.get(redAliens.size() - 1).x > p.width - p.width / 50) {
                    redAlien.changeVelocity();
                    redAlien.moveDown();
                } else if (redAliens.get(0).x < p.width / 50) {
                    redAlien.changeVelocity();
                    redAlien.moveDown();
                }
            }
        }

        if (alienMoveTime == 35) {
            for (AlienRed redAlien : redAliens) { redAlien.move(); }
        }

        if (alienMoveTime == 45) {
            for (AlienGreen greenAlien : greenAliens) {
                if (greenAliens.get(greenAliens.size() - 1).x > p.width - p.width / 50) {
                    greenAlien.changeVelocity();
                    greenAlien.moveDown();
                } else if (greenAliens.get(0).x < p.width / 50) {
                    greenAlien.changeVelocity();
                    greenAlien.moveDown();
                }
            }
        }

        if (alienMoveTime == 45) {
            for (AlienGreen greenAlien : greenAliens) { greenAlien.move(); }
        }

        if (alienMoveTime == 50) {
            for (AlienBlue blueAlien : blueAliens) {
                if (blueAliens.get(blueAliens.size() - 1).x > p.width - p.width / 50) {
                    blueAlien.changeVelocity();
                    blueAlien.moveDown();
                } else if (blueAliens.get(0).x < p.width / 50) {
                    blueAlien.changeVelocity();
                    blueAlien.moveDown();
                }
            }
        }

        if (alienMoveTime == 50) {
            for (AlienBlue blueAlien : blueAliens) { blueAlien.move(); }
        }

        if (alienMoveTime == 55) {
            for (AlienPurple purpleAlien : purpleAliens) {
                if (purpleAliens.get(purpleAliens.size() - 1).x > p.width - p.width / 50) {
                    purpleAlien.changeVelocity();
                    purpleAlien .moveDown();
                } else if (purpleAliens.get(0).x < p.width / 50) {
                    purpleAlien.changeVelocity();
                    purpleAlien.moveDown();
                }
            }
        }

        if (alienMoveTime == 55) {
            for (AlienPurple purpleAlien : purpleAliens) {purpleAlien.move();}
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

        for (AlienYellow yellowAlien : yellowAliens) {
            yellowAlien.draw();
        }

        for (AlienRed redAlien : redAliens) {
            redAlien.draw();
        }

        for (AlienGreen greenAlien : greenAliens) {
            greenAlien.draw();
        }

        for (AlienBlue blueAlien : blueAliens) {
            blueAlien.draw();
        }

        for (AlienPurple purpleAlien : purpleAliens) {
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