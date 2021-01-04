package USA_ELECTION_SIMULATOR;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class FMXLDocumentController{
    
    
    @FXML
    private static MenuItem exitBtn;

    @FXML
    private static Label timeLabel;

    // @FXML
    // private static Label electoralVotesLebel;

    // @FXML
    // private static Label moneyLabel;

    @FXML
    void exitFromGame(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    static void initialize(int time) {
        timeLabel.setText("Weeks until election: " + time);
    }
}