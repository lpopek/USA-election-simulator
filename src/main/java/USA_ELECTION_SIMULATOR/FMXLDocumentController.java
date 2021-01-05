package USA_ELECTION_SIMULATOR;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import USA_ELECTION_SIMULATOR.Game;
import USA_ELECTION_SIMULATOR.App;

public class FMXLDocumentController implements Initializable {


    
    
    ////////BUTTONS////////
    @FXML private static MenuItem exitBtn;
    @FXML private Button endTurnBtn;

    //////////LABELS//////
    @FXML private Label timeLabel;
    @FXML private Label moneyLabel;
    @FXML private Label electoralVotesLabel;
    

    ////////////STATES GEOMETRY////////////////
    @FXML private Polygon AZ;
    @FXML private Polygon CA;
    @FXML private Polygon CO;
    @FXML private Polygon ID;
    @FXML private Polygon KS;
    @FXML private Polygon MT;
    @FXML private Polygon ND;
    @FXML private Polygon NE;
    @FXML private Polygon NM;
    @FXML private Polygon NV;
    @FXML private Polygon OK;
    @FXML private Polygon OR;
    @FXML private Polygon SD;
    @FXML private Polygon TX;
    @FXML private Polygon UT;
    @FXML private Polygon WA;
    @FXML private Polygon WY;

    


    ///////////ARIZONA///////////
    @FXML void clickStateAZ(Event event){
        AZ.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateAZ(Event event){
        AZ.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateAZ(Event event){
        AZ.setFill(Color.WHITE);
    }


    ///////////CALIFORNIA///////////
    @FXML void clickStateCA(Event event){
        CA.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateCA(Event event){
        CA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateCA(Event event){
        CA.setFill(Color.WHITE);
    }


    ///////////COLORADO///////////
    @FXML void clickStateCO(Event event){
        CO.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateCO(Event event){
        CO.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateCO(Event event){
        CO.setFill(Color.WHITE);
    }

    ///////////IDAHO///////////
    @FXML void clickStateID(Event event){
        ID.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateID(Event event){
        ID.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateID(Event event){
        ID.setFill(Color.WHITE);
    }

    ///////////NEVADA///////////
    @FXML void clickStateNV(Event event){
        NV.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateNV(Event event){
        NV.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNV(Event event){
        NV.setFill(Color.WHITE);
    } 

    ///////////NEW MEXICO///////////
    @FXML void clickStateNM(Event event){
        NM.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateNM(Event event){
        NM.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNM(Event event){
        NM.setFill(Color.WHITE);
    }

    ///////////MONTANA///////////
    @FXML void clickStateMT(Event event){
        MT.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateMT(Event event){
        MT.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMT(Event event){
        MT.setFill(Color.WHITE);
    }
    
    ///////////OREGON///////////
    @FXML void clickStateoOR(Event event){

        OR.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateOR(Event event){
        OR.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateOR(Event event){
        OR.setFill(Color.WHITE);
    }

    ///////////UTAH///////////
    @FXML void clickStateUT(Event event){
        UT.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateUT(Event event){
        UT.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateUT(Event event){
        UT.setFill(Color.WHITE);
    }

    ///////////WASCHINGTON///////////
    @FXML void clickStateWA(Event event){
        WA.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateWA(Event event){
        WA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateWA(Event event){
        WA.setFill(Color.WHITE);
    }


    ///////////COLORADO///////////
    @FXML void clickStateWY(Event event){
        WY.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateWY(Event event){
        WY.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateWY(Event event){
        WY.setFill(Color.WHITE);
    }
   



    @FXML public void initLabels() {
        timeLabel.setText("Weeks until election: " + App.GAME.getWeekTillElections());
        electoralVotesLabel.setText("Electoral votes: " + 270);
        moneyLabel.setText("Money: " + App.GAME.getMoney()+ "$");
    }



    @FXML
    void exitFromGame(ActionEvent event) {
        System.exit(0);
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initLabels();
    }
    

}