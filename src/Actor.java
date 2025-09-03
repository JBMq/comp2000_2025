import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.*;

public abstract class Actor {
  // Color color;
  Cell loc;
  List<Polygon> polygons = new ArrayList<Polygon>();

  public void paint(Graphics g) {
    // g.setColor(color);
    // g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    // g.setColor(Color.GRAY);
    // g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);

    for (Polygon cur : polygons) {
      g.drawPolygon(cur);
    }
  }
}
