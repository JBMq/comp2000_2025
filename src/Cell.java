import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cell {
    int x;
    int y; // Top corner
    int size;

    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw(){
        //drawRect(x, y, size, size);
    }
}
