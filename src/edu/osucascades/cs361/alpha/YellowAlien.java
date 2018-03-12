package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class YellowAlien extends Alien {

    public YellowAlien (PApplet p, int x, int y) {
        super(p, x, y, 30, p.color(255, 255, 0));
    }

}
