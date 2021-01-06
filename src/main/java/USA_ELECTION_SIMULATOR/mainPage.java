
package USA_ELECTION_SIMULATOR;
 
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class mainPage {
    @FXML
    private AnchorPane rootPane;


    @FXML
    private void loadPlay(ActionEvent event) throws IOException {
        AnchorPane playPane = (AnchorPane) FXMLLoader.load(getClass().getResource("play.fxml"));
        rootPane.getChildren().setAll(playPane);
    }

    @FXML private void loadScores(ActionEvent event) throws IOException {
        AnchorPane scorePane = (AnchorPane) FXMLLoader.load(getClass().getResource("sscores.fxml"));
        rootPane.getChildren().setAll(scorePane);
    }
}
