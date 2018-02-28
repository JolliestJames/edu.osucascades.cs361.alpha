import processing.core.PApplet;

public class GameSketch extends PApplet {

    Game game;

    public void settings()
    {
        size(width: 500, height: 500);
        game = new Game(500, 500);
    }
    public void setup()
    {

    }

    public void draw()
    {
        ellipse(a: 100, b: 100, c: 100, d: 100);
    }

}