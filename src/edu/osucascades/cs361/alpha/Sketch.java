package edu.osucascades.cs361.alpha;
import processing.core.PApplet;

public class Sketch extends PApplet {

    Game game;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        game = new Game(this);
        game.draw();
    }

    public void draw() {
        game.update();
        game.draw();
    }
}
