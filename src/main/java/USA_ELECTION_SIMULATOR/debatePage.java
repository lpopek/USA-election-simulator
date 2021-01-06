
package USA_ELECTION_SIMULATOR;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


public class debatePage implements Initializable {


    @FXML private AnchorPane debatePane;

    @FXML private Text question;

    @FXML private Text answerA;
    @FXML private Text answerB;
    @FXML private Text answerC;


    @FXML private AnchorPane resultsPane;


    @FXML private Text state;
    @FXML private Text gopResults;
    @FXML private Text demResults;

    int number = 0;

    public Debate debate = new Debate("California");

    @FXML private void createDebate() {
        debate.createQuestion("question 1", 30, 70, "answer 1- 1", 20, 80, "answer2 - 1", 40, 60, "answer3 - 1");
        debate.createQuestion("question 2", 30, 70, "answer 1- 2", 20, 80, "answer2 - 2", 40, 60, "answer3 - 2");
        debate.createQuestion("question 3", 30, 70, "answer 1- 3", 20, 80, "answer2 - 3", 40, 60, "answer3 - 3");
    }


    @FXML protected void printQuestion() {
        debate.printQuestionDebate(number, question, answerA, answerB, answerC);

    }
    @FXML protected void printQuestion1() {
        question.setText("Question");
    }

    // @FXML protected void printAnswer() {
    //     answerA.setText("Answer A");
    //     answerB.setText("Answer B");
    //     answerC.setText("Answer C");
    // }

    @FXML
    private void chooseA(ActionEvent event) throws IOException {
        Issue i = debate.questions.get(number);
        debate.answerQuestion(i, 0);
        checkEnd();

    }

    @FXML
    private void chooseB(ActionEvent event) throws IOException {
        Issue i = debate.questions.get(number);
        debate.answerQuestion(i, 1);
        checkEnd();
    }

    @FXML
    private void chooseC(ActionEvent event) throws IOException {
        Issue i = debate.questions.get(number);
        debate.answerQuestion(i, 2);
        checkEnd();
    }


    @FXML
    private void checkEnd() throws IOException {
        if (number >= debate.questions.size() - 1){
            loadResults();
        }
        else{
            number++;
            printQuestion();
        }

    }

    private void loadResults() throws IOException {
        AnchorPane resultsPane = (AnchorPane) FXMLLoader.load(getClass().getResource("debate_results.fxml"));
        debatePane.getChildren().setAll(resultsPane);

        printResults();

    }

    private void printResults(){
        state.setText(debate.destionation);
        gopResults.setText(String.valueOf(debate.GOPSupport));
        demResults.setText(String.valueOf(debate.DEMSupport));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        createDebate();
        printQuestion();

    }    

}