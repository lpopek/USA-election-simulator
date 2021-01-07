
package USA_ELECTION_SIMULATOR;
 
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class mainPage {

    @FXML
    private void loadPlay(ActionEvent event) throws IOException {
        App.screenController.activate("choose_player");
    }

    @FXML private void loadScores(ActionEvent event) throws IOException {
        App.screenController.activate("highscores");
    }

    @FXML private void exit(ActionEvent event) throws IOException {
        System.exit(0);
    }
}
