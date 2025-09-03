import java.awt.Graphics;
import java.awt.Point;
import java.util.*;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;

  List<Actor> actors = new ArrayList<Actor>();

  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
    actors.add(cat);
    actors.add(dog);
    actors.add(bird);
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    // cat.paint(g);
    // dog.paint(g);
    // bird.paint(g);
    
    for (Actor cur : actors) {
      cur.paint(g);
    }

    System.out.println(grid.cellAtPoint(mouseLoc));
  }
}
