
package USA_ELECTION_SIMULATOR;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


public class debateResults implements Initializable {


    @FXML private AnchorPane resultsPane;


    @FXML private Text state;
    @FXML private Text gopResults;
    @FXML private Text demResults;


    protected void printResults(Debate debate){
        state.setText(debate.destionation);
        gopResults.setText(String.valueOf(debate.GOPSupport));
        demResults.setText(String.valueOf(debate.DEMSupport));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //printResults();

    }    

}