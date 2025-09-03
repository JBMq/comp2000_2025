import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;

public class Grid {
  Cell[][] cells = new Cell[20][20];
  
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }

  public void paint(Graphics g, Point mousePos) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }
  }

  public Cell cellAtColRow(int c, int r) {
    return cells[c][r];
  }

  public Optional<Cell> cellAtPoint(Point p) {
    if (p != null) {
      double x = -10 + p.getX();
      double y = -10 + p.getY();
      x = (x - (x % Cell.size)) / Cell.size;
      // y = (y - 1) / Cell.size;
      // y = (y) / Cell.size;
      y = (y - (y % Cell.size)) / Cell.size;
      y++;
      if (x >= 0 && y >= 0 && x < 20 && y < 20) {
        Optional<Cell> opt = Optional.of(cells[(int) x][(int) y]);
        return opt;
      }
    }

    return Optional.empty();
  }
}
