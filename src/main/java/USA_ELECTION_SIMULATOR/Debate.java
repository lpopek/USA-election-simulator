package USA_ELECTION_SIMULATOR;

import java.util.ArrayList;

import javafx.scene.text.Text;

public class Debate {
    String destionation;
    int GOPSupport;
    int DEMSupport;
    int answerGOPSupport;
    int answerDEMSupport;
    ArrayList<Issue> questions;

    public  Debate(String state) {
        this.destionation = state;
        questions = new ArrayList<Issue>();
    }

    public void createQuestion(String question, int GOPSupport1,int DEMSupport1, String answer1, int GOPSupport2,int DEMSupport2, String answer2,int GOPSupport3,int DEMSupport3, String answer3){
        Issue q = new Issue(question);
        q.appendAnswer(GOPSupport1, DEMSupport1, answer1);
        q.appendAnswer(GOPSupport2, DEMSupport2, answer2);
        q.appendAnswer(GOPSupport3, DEMSupport3, answer3);
        questions.add(q);
    }

    public void printQuestionDebate(int i, Text question, Text answerA, Text answerB, Text answerC){
        Issue q = questions.get(i);
        question.setText(q.question);
        
        Answer a = q.answers.get(0);
        Answer b = q.answers.get(1);
        Answer c = q.answers.get(2);

        answerA.setText(a.answer);
        answerB.setText(b.answer);
        answerC.setText(c.answer);

    }

    public void answerQuestion(Issue i, int selectedAnswer){

        i.choice(selectedAnswer);

        answerDEMSupport += i.DEMSupport;
        answerGOPSupport += i.GOPSupport;
    }
    public void endDebate(){
        calculateSupport();
        System.out.print("The debate in" + destionation + "ended." );

        System.out.print(GOPSupport + "% of Republicans have similar views" );
        System.out.print(DEMSupport + "% of Democrats have similar views" );
    }
    public void calculateSupport(){
        GOPSupport = answerGOPSupport/ questions.size();
        DEMSupport = answerDEMSupport/ questions.size();
    }


}
