package USA_ELECTION_SIMULATOR;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class mainGame extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("main_page.fxml"));
        primaryStage.setTitle("Become a LEADER");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}