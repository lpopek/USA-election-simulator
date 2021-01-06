package USA_ELECTION_SIMULATOR;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Highscores extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Highscores.stage = primaryStage;
        FXMLLoader loader = new FXMLLoader(new File("resources/highscores.fxml").toURI().toURL());
        // FXMLLoader loader = new FXMLLoader(new File("resources/choose_player.fxml").toURI().toURL());
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("USA_Simulator");
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
};