import java.util.ArrayList;
import java.util.*;  

public class Issue {
    String question;
    ArrayList<Answer> answers;
    int GOPSupport;
    int DEMSupport;

    public  Issue(String question) {
        this.question = question;
    }

    public void appendAnswer(int GOPSupport,int DEMSupport, String answer){
        Answer ans = new Answer(GOPSupport, DEMSupport, answer);
        answers.add(ans);
    }

    public void chooseAnswer(){
        for (int i = 0; i < answers.size(); i++) {  
            Answer a = answers.get(i);
            System.out.print(i + ": " + a.answer );  
        }  
        
        choice();
    }

    void choice(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Choose your answer- ");  
        int selectedAnswer = sc.nextInt(); 
        if(selectedAnswer <= 0 || selectedAnswer >= answers.size()){

            Answer a = answers.get(selectedAnswer);
            System.out.print( "Your answer: " + a.answer );

            System.out.println("Support among the Republicans= " + a.GOPSupport);  
            System.out.println("Support among the Democrats= " + a.GOPSupport);  

            DEMSupport = a.DEMSupport;
            GOPSupport = a.GOPSupport;
        } 
        else{
            System.out.println("Incorrect answer" +selectedAnswer); 
            choice();
        }
    }
}
