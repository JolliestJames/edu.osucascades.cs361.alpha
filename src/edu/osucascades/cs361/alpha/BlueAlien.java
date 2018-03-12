package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class BlueAlien extends Alien {

    public BlueAlien (PApplet p, int x, int y) {
            super(p, x, y, 50, p.color(0, 0, 255));
    }

}
