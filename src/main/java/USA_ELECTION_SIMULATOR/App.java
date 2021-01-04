package USA_ELECTION_SIMULATOR;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(new File("main_view.fxml").toURI().toURL());
        Parent root = loader.load();
         Scene scene = new Scene(root);
         stage.setTitle("USA_Simulator");
         stage.setScene(scene);
         stage.show();
     }
}
