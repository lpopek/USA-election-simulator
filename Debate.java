import java.util.ArrayList;

public class Debate {
    String destionation;
    int GOPSupport;
    int DEMSupport;
    int answerGOPSupport;
    int answerDEMSupport;
    ArrayList<Issue> questions;

    public  Debate(String state) {
        this.destionation = state;
    }

    public void createQuestion(String question){
        Issue q = new Issue(question);
        questions.add(q);
    }

    public void startDebate(){
        for (int i = 0; i < questions.size(); i++) {  
            Issue q = questions.get(i);
            answerQuestion(q);
        }

        calculateSupport();
        System.out.print("The debate in" + destionation + "ended." );

        System.out.print(GOPSupport + "% of Republicans have similar views" );
        System.out.print(DEMSupport + "% of Democrats have similar views" );
    }

    public void answerQuestion(Issue i){
        System.out.print(i.question );
        i.chooseAnswer();
        answerDEMSupport += i.DEMSupport;
        answerGOPSupport += i.GOPSupport;
    }

    public void calculateSupport(){
        GOPSupport = answerGOPSupport/ questions.size();
        DEMSupport = answerDEMSupport/ questions.size();
    }


}
