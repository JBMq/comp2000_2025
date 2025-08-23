import java.awt.Color;
import java.awt.Graphics;

public class Actor {

  // fields
  int x;
  int y;
  int size;
  Color c;

  // constructors
    public Actor(int inX, int inY, int inSize, Color inColor) {
        x = inX;
        y = inY;
        size = inSize;
        c = inColor;
    }

    public void paint(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, size, size);
        g.drawRect(x, y, size, size);
    }
    
}
