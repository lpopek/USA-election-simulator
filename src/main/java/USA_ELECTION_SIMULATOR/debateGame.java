package USA_ELECTION_SIMULATOR;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class debateGame extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = (StackPane) FXMLLoader.load(getClass().getResource("debate_main.fxml"));
        primaryStage.setTitle("Become a LEADER");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}