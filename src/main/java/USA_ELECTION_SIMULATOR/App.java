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
        screenController.addScreen("defeat", FXMLLoader.load(getClass().getResource( "FXML_Files/defeat.fxml" )));
        screenController.addScreen("GOPwin", FXMLLoader.load(getClass().getResource( "FXML_Files/GOPwin.fxml" )));
        screenController.addScreen("DEMwin", FXMLLoader.load(getClass().getResource( "FXML_Files/DEMwin.fxml" )));
        stage.show();
     }

    protected static void reset() throws FileNotFoundException {
        App.GAME = new Game();
    }
     
}




