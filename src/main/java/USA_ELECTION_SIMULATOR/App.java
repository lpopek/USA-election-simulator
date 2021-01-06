package USA_ELECTION_SIMULATOR;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    static Game GAME;

    public App() throws FileNotFoundException {
        GAME = new Game();
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("USA_Simulator");
        
        FXMLLoader mainPage = (new FXMLLoader(new File("./src/main/java/USA_ELECTION_SIMULATOR/main_page.fxml").toURI().toURL()));
        Parent mainPageRoot = mainPage.load();
        Scene primaryScene = new Scene(mainPageRoot);
        stage.setScene(primaryScene);
        // FXMLLoader loaderMap = new FXMLLoader(new File("./src/main/java/USA_ELECTION_SIMULATOR/main_view.fxml").toURI().toURL());
        // Parent root = loaderMap.load();
        // Scene sceneMap = new Scene(root);
        // stage.setScene(sceneMap);
        stage.show();
     }
     
}




