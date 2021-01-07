package USA_ELECTION_SIMULATOR;

import java.util.HashMap;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ScreenController {
    private HashMap<String, Pane> screen = new HashMap<>();
    private Scene main;

    public ScreenController(Scene main) {
        this.main = main;
    }

    protected void addScreen(String name, Pane pane){
         screen.put(name, pane);
    }

    protected void removeScreen(String name){
        screen.remove(name);
    }

    protected void activate(String name){
        main.setRoot( screen.get(name) );
    }
}