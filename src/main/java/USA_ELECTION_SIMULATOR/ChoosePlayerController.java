package USA_ELECTION_SIMULATOR;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;

public class ChoosePlayerController {

    @FXML
    public TextField nameField;

    @FXML
    public TextField homeStateField;

    @FXML
    public Text dataPrompt;

    @FXML
    public ToggleButton republicanButton;

    @FXML
    public ToggleButton democraticButton;

    @FXML
    private void loadGame(ActionEvent event) {        
        System.out.println("clicked Play");
        //TODO: load game screen, get data from name field and state field
        String name = nameField.getText();
        String state = homeStateField.getText();
        String party = "";
        if (republicanButton.isSelected()){party = "Republican";}
        else if (democraticButton.isSelected()){party = "Democratic";}
        if (name.isEmpty()) {
            dataPrompt.setText("Enter your name");
            dataPrompt.setVisible(true);
        }
        else if (state.isEmpty()) {
            dataPrompt.setText("Enter home state");
            dataPrompt.setVisible(true);
        }
        else if (party.isEmpty()) {
            dataPrompt.setText("Choose your party");
            dataPrompt.setVisible(true);
        }
        else {
            dataPrompt.setVisible(false);
            System.out.println(party+" player "+name+" from "+state);
        }
        App.screenController.activate("map");
        
    }

    @FXML
    private void loadMainScreen(ActionEvent event) {        
        System.out.println("clicked Back");
        App.screenController.activate("main");
    }

    @FXML
    private void clickedDemocratic(ActionEvent event) {        
        System.out.println("clicked Democratic");
        republicanButton.setSelected(false);
        // TODO: unclick republican, save into player object
    }

    @FXML
    private void clickedRepublican(ActionEvent event) {        
        System.out.println("clicked Republican");
        democraticButton.setSelected(false);
        // TODO: unclick democratic, save into player object
    }


    
}
