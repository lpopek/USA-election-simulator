package USA_ELECTION_SIMULATOR;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    ArrayList<State> USA = new ArrayList<State>();
    Player player = new Player(null, null, null);
    int money = 10;
    int weekTillElection = 10;
    int electoralVotes;
    int noActionProTurn = 4;
    int actionProTurnDefaultValue = 4;
    boolean gameOver = false;
    boolean isWinner = false;
    State chosenState = null;
    Comunnication currentInfo = null;
    Comunnication [] popularInfo ={
        new Comunnication("Choose state", 1), 
        new Comunnication("Too many actions in current round", 1),
        new Comunnication("Not enought money", 1)
    };


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
            State s = new State(helper[0], helper[1], Integer.parseInt(helper[2]), Integer.parseInt(helper[3]));
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
            this.noActionProTurn = this.actionProTurnDefaultValue;
        }

    }

    protected boolean getFounds(){
        if(this.checkIfAbleToMakeSupportAction(0) == true){
            this.money += this.chosenState.raiseFounds(player.party);
            return true;
        }
        else
            return false;
    }

    protected boolean checkIfAbleToMakeSupportAction(int neededFounds){
        if(this.chosenState == null){
            this.currentInfo = this.popularInfo[0];
            System.out.println(this.currentInfo);
            return false;
        }
        if(this.noActionProTurn <= 0){
            this.currentInfo = this.popularInfo[1];
            System.out.println(this.currentInfo);
            return false;
        }
        if(this.money < neededFounds){
            this.currentInfo = this.popularInfo[0];
            System.out.println(this.currentInfo);
            return false;
        }
        else
            return true;
    }



    protected boolean visitState(){
        if(this.chosenState != null){
            if(this.noActionProTurn > 0){
                if(this.money > 0){
                    chosenState.visitState(App.GAME.player.party);
                    this.noActionProTurn--;
                    return true;
                }
                //TODO makecondition for maoney
                else{
                //TODO say why it is imposible     
                    return false;
                }

            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    protected int getCostOfVisit(State s){
        return 0;
    }

    protected boolean launchTVCampaign(){
        return true;
    }
}