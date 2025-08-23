import java.awt.Color;
import java.awt.Graphics;

public class Stage {
    Grid grid = new Grid();
    int size = Cell.size;
    Actor dog = new Actor(35,680, size, Color.yellow);
    Actor cat = new Actor(70,680, size, Color.blue);
    Actor bird = new Actor(105, 680, size, Color.green);
    Graphics g;

    public void drawActors() {
        dog.paint(g);
        cat.paint(g);
        bird.paint(g);
    }

    // Stage(Graphics gIn) {
    //     g = gIn;
    // }
}

