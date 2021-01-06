package USA_ELECTION_SIMULATOR;

import java.util.ArrayList;

public class Issue {
    String question;
    ArrayList<Answer> answers;
    int GOPSupport;
    int DEMSupport;

    public  Issue(String question) {
        this.question = question;
        answers = new ArrayList<Answer>();
    }

    public void appendAnswer(int GOPSupport,int DEMSupport, String answer){
        Answer ans = new Answer(GOPSupport, DEMSupport, answer);
        this.answers.add(ans);
    }

    public void choice(int selectedAnswer){
        Answer a = answers.get(selectedAnswer);
        DEMSupport = a.DEMSupport;
        GOPSupport = a.GOPSupport;

    }
}
