package USA_ELECTION_SIMULATOR;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    ArrayList<State> USA = new ArrayList<State>();
    Player player = new Player(null, null, null);
    int money = 1000;
    int weekTillElection = 10;
    int electoralVotes;
    int noActionProTurn = 3;
    boolean gameOver = false;
    boolean isWinner = false;


    protected int countVotes(){
        int electoralVotes = 0; 
        if (player.party == "R"){
            for(int i=0; i < this.USA.size(); i++){
                State s = this.USA.get((i));
                if (s.DEMSupport < s.GOPSupport){electoralVotes += s.electoralVotes;}
            } 
        }
        else{
            for(int i=0; i < this.USA.size(); i++){
                State s = this.USA.get((i));
                if (s.DEMSupport > s.GOPSupport){electoralVotes += s.electoralVotes;}
            } 
        }
        this.electoralVotes = electoralVotes;
        return electoralVotes;   
    }

    protected int getWeekTillElections(){
        return this.weekTillElection;
    }
    public int getMoney(){
        return this.money;
    }

    public Game() throws FileNotFoundException {
        String[] dataStates = getDataFromFile();
        System.out.print( "gra zainicjalizowana\n" );;
        getUSListRandom(dataStates);
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
        if (electoralVotes > 270)
            this.isWinner = true;
    }

    public State chooseStateByID(String searchID){
        State helper = null;
        boolean isFound = false;
        for(int i = 0; i < this.USA.size(); i++){
            helper = this.USA.get(i);
            if (helper.id.equals(searchID) == true)
            {
                isFound = true;
                break;
            }
        }
        this.USA.remove(helper);
        return helper;
    }

    protected void finishTurn(){
        if (this.weekTillElection == 0){
            this.getWinner();
            this.gameOver = true;}
        else{
            this.weekTillElection --;
            this.noActionProTurn = 3;
        }

    }
    protected void visitState(State s){

    }
}