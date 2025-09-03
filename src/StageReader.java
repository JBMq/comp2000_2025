import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StageReader {
  public static Stage readStage(String path) throws IOException {
    Stage stage = new Stage();
    List<String> lines = Files.readAllLines(Paths.get(path));
    List<Actor> actors = new ArrayList<Actor>();
    Grid grid = new Grid();

    //ColRow=Actor
    for (String cur : lines) {
      int col = ((int) (cur.charAt(0))) - 65;
      int row = ((int) cur.charAt(1)) - 48;
      String name;

      if (cur.charAt(2) != '=') {
        row = (((int) cur.charAt(1)) - 48) + (((int) cur.charAt(2)) - 48);
        name = cur.substring(4);
      } else {
        row = ((int) cur.charAt(1)) - 48;
        name = cur.substring(3);
      }
      
      System.out.println(col + " " + row);
      // int col = 2;
      // int row = 2;

      
      if (name.compareTo("cat") == 0) {
        actors.add(new Cat(grid.cellAtColRow(col, row).get()));
      } else if (name.compareTo("dog") == 0) {
        actors.add(new Dog(grid.cellAtColRow(col, row).get()));
      } else {
        actors.add(new Bird(grid.cellAtColRow(col, row).get()));
      }
    }
    
    stage.actors = actors;
    stage.grid = grid;
    return stage;
  }
}