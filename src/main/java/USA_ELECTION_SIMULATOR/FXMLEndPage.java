package USA_ELECTION_SIMULATOR;

import java.io.FileNotFoundException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLEndPage {
    @FXML
    Button exitBtn;
    @FXML
    Button mainMenuBtn;

    @FXML
    void exitFromGame(Event event) {
        System.exit(0);
    }

    @FXML
    protected void backToMainMenu(Event e) throws FileNotFoundException {
        App.screenController.activate("main");
        App.reset();
    }

}
