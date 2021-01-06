package USA_ELECTION_SIMULATOR;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class HighscoresController implements Initializable {

    private ObservableList<PlayerScore> scores = FXCollections.observableArrayList();

    @FXML
    private TableView<PlayerScore> scoreTable;

    @FXML
    public TableColumn<PlayerScore, Integer> score;

    @FXML
    public TableColumn<PlayerScore, String> name;
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        loadData();

    }
    @FXML
    private AnchorPane mainHighscores;

    @FXML
    private void loadChoosePlayer(ActionEvent event) {        
        System.out.println("clicked Play Game");
    }

    @FXML
    private void loadMainScreen(ActionEvent event) {        
        System.out.println("clicked Back");
    }

    private void loadData() {
        try {
            getDataFromFile(scores);
            //add last score for current player
            score.setCellValueFactory(new PropertyValueFactory<>("Score"));
            name.setCellValueFactory(new PropertyValueFactory<>("Name"));
            scoreTable.setItems(scores);
        } catch (FileNotFoundException e) {
            
        }
    }

    public static void getDataFromFile(ObservableList<PlayerScore> scores) throws FileNotFoundException {
        File stateData = new File("resources/highscores.txt");
        Scanner sc = new Scanner(stateData);
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] sline = line.split(" ");
            int score = 0;
            String party = new String(), name = new String();
            if (sline != null && sline.length >= 3) {
                score = Integer.parseInt(sline[sline.length-1]);
                party = sline[0];
                String[] nameArr = Arrays.copyOfRange(sline, 1, sline.length-1);
                for (String j : nameArr) { 
                    name += " "+j; 
                } 
            }
            PlayerScore player = new PlayerScore(score, name, party);
            scores.add(player);
           }
        sc.close();
    }


}
