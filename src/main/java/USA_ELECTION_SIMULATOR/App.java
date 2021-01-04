package USA_ELECTION_SIMULATOR;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import USA_ELECTION_SIMULATOR.Game;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(new File("./src/main/java/USA_ELECTION_SIMULATOR/main_view.fxml").toURI().toURL());
        Game g = new Game();
        //FMXLDocumentController.initialize(g.daysTillElection);
        Parent root = loader.load();
         Scene scene = new Scene(root);
         stage.setTitle("USA_Simulator");
         stage.setScene(scene);
         
         
         stage.show();
     }
     
}




