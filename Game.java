import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    ArrayList<State> USA = new ArrayList<State>();
    int daysTillElection = 20;
    boolean gameOver = false;
    public Game(){
        System.out.print( "gra zainicjalizowana\n" );
    }

    public static String[] getDataFromFile() throws FileNotFoundException {
        String[] tab = new String[51];
        File stateData = new File("state_data.txt");
        Scanner sc = new Scanner(stateData);
        sc.nextLine();
        int i = 0;
        while (sc.hasNextLine()) {
            tab[i] = sc.nextLine();
            i++;
           }
        sc.close();
        return tab;
    }

    public void getUSListRandom(String[] dataTable){
        for(int i= 0; i < dataTable.length; i++){
            String[] helper = dataTable[i].split("\\|", 0);
            State s = new State(helper[0], helper[1], Integer.parseInt(helper[2]));
            s.getRandomSupport();
            s.getRandomType();
            this.USA.add(s);
        }
    }

    public void getWinner(){
        int GOPElectVotes = 0 , DEMElectVotes = 0;

        for(int i=0; i < this.USA.size(); i++){
            State s = this.USA.get((i));
            System.out.println(s);
            if (s.DEMSupport > s.GOPSupport)
                DEMElectVotes += s.electoralVotes;
            else
                GOPElectVotes += s.electoralVotes;
        }
        if (GOPElectVotes > DEMElectVotes){
            System.out.println("Wygrał kandydat Republikanów liczbą głosów " + GOPElectVotes);
            this.gameOver = true;
        }
        else{
            System.out.println("Wygrał kandydat Demokratów liczbą głosów " + DEMElectVotes);
            this.gameOver = true;
        }
        
    }

    public void finishTurn(){
        System.out.println("Tura numer:"+ this.daysTillElection);
        if (this.daysTillElection == 0)
            this.getWinner();
        else
            this.daysTillElection --;
    }



    public static void main(String[] args){
        try{
            String[] dataStates = getDataFromFile();
            Game g = new Game();
            g.getUSListRandom(dataStates);
            // for(int i=0; i < g.USA.size(); i++){
            //     System.out.println(g.USA.get((i)));
            // }
            while(g.gameOver == false){
                g.finishTurn();
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Nie udało się otworzyć pliku z danymi");
        }
        
        
      }
}