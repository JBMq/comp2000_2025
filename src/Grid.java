// import java.awt.Dimension;
// import java.awt.Graphics;

// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class Grid extends JFrame {
//     public static void main(String[] args) throws Exception {
//       Main window = new Main();
//       window.run();
//     }

//     class Canvas extends JPanel {
//       public Canvas() {
//         setPreferredSize(new Dimension(720, 720));
//       }

//       @Override
//       public void paint(Graphics g) {
//       	g.setColor(java.awt.Color.BLACK);
//         g.drawRect(10, 10, 700, 700);
//         for (int i = 10; i < 720; i += 35) {
//           g.drawLine(10, i, 710, i);
//         }
//         for(int j = 10; j < 720; j += 35){
//           g.drawLine(j, 10, j, 710);
//         }
//       }
//     }

//     private Main() {
//       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       Canvas canvas = new Canvas();
//       this.setContentPane(canvas);
//       this.pack();
//       this.setVisible(true);
//     }

//     public void run() {
//       while(true) {
//         repaint();
//       }
//     }
// }


import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JFrame {
    public static void main(String[] args) throws Exception {
      Grid window = new Grid(); //needs to be same name as the class
      window.run();
    }

    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
      	g.setColor(java.awt.Color.BLACK);
        g.drawRect(10, 10, 700, 700);
        for (int i = 10; i < 720; i += 35) {
          g.drawLine(10, i, 710, i);
        }
        for(int j = 10; j < 720; j += 35){
          g.drawLine(j, 10, j, 710);
        }
      }
    }

    private Grid() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
