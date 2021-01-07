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
    static ScreenController screenController;
    public App() throws FileNotFoundException {
        GAME = new Game();
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("USA_Simulator");
        
        FXMLLoader mainPage = (new FXMLLoader(new File("./src/main/java/USA_ELECTION_SIMULATOR/FXML_Files/main_page.fxml").toURI().toURL()));
        Parent mainPageRoot = mainPage.load();
        Scene primaryScene = new Scene(mainPageRoot);
        stage.setScene(primaryScene);
        screenController = new ScreenController(primaryScene);
        screenController.addScreen("main", FXMLLoader.load(getClass().getResource( "FXML_Files/main_page.fxml" )));
        screenController.addScreen("choose_player", FXMLLoader.load(getClass().getResource( "FXML_Files/choose_player.fxml" )));
        screenController.addScreen("highscores", FXMLLoader.load(getClass().getResource( "FXML_Files/highscores.fxml" )));
        screenController.addScreen("map", FXMLLoader.load(getClass().getResource( "FXML_Files/main_view.fxml" )));
        
        //screenController.addScreen("set_player", FXMLLoader.load(getClass().getResource( "choose_player.fxml" )));
        

        // FXMLLoader loaderMap = new FXMLLoader(new File("./src/main/java/USA_ELECTION_SIMULATOR/main_view.fxml").toURI().toURL());
        // Parent root = loaderMap.load();
        // Scene sceneMap = new Scene(root);
        // stage.setScene(sceneMap);
        stage.show();
     }
     
}




