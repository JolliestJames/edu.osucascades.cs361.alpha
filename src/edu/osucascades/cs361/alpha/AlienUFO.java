package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class AlienUFO {

    PApplet p;
    int x, y, speed, pointvalue;

    public AlienUFO (PApplet pApplet) {
        p = pApplet;
        speed = p.round(p.random(-15, 15));
        x = -20;
        y = p.height / 15;
    }

    public void move() {
        if (speed > 0) {
            x += speed;
        } else {
            x -= speed;
        }
    }

    public void draw() {
        p.fill(167, 72,188);
        p.rect(x, p.height / 15, p.width / 10, p.height / 20);
    }

    public void ifNotShotDown() {
        if (x > p.width + 20 || x < -20) {
            // need some self-destruct logic
        }
    }
}
