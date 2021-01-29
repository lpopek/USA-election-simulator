package USA_ELECTION_SIMULATOR;

import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    ArrayList<State> USA = new ArrayList<State>();
    Player player1 = new Player(null, null, null);
    Player player2 = new Player(null, null, null);

    int moneyPlayerOne = 0;
    int moneyPlayerTwo = 0;
    int weekTillElection = 10;
    int electoralVotes;
    int noActionProTurnPlayerOne = 3;
    int noActionProTurnPlayerTwo = 3;
    int actionProTurnDefaultValue = 3;
    boolean gameOver = false;
    boolean isWinnerPlayerOne = false;
    State chosenState = null;
    ArrayList<State> choosenBySI = new ArrayList <State>();
    boolean isHumanPlayerTurn = true;
    Comunnication currentInfo = null;
    Comunnication [] popularInfo ={
        new Comunnication("Choose state", 1), 
        new Comunnication("Too many actions in current round", 1),
        new Comunnication("Not enought money", 1),
        new Comunnication("This State is already visited" , 1),
        new Comunnication("This State has already lauched TV Campaign" , 1),
        new Comunnication("In this State has alreardy been raised founds" , 1),
        new Comunnication("NEXT ROUND", 0)
    };

    protected int getGOPElectVotes(){
        int GOPELectVotes = 0;
        for(int i=0; i < this.USA.size(); i++){
            State s = this.USA.get((i));
            if (s.DEMSupport < s.GOPSupport)
                GOPELectVotes += s.electoralVotes;
        }
        return GOPELectVotes;
    }

    protected int getDEMElectVotes(){
        return 538 - this.getGOPElectVotes();
    }


    protected int countVotes(){
        int electoralVotes = 0; 
        if (player1.party == "R"){
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
        return this.moneyPlayerOne;
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
        this.countVotes();
        if (this.electoralVotes > 270)
            this.isWinnerPlayerOne = true;
    }


    protected void finishTurn(){
        if (this.weekTillElection == 0){
            this.getWinner();
            this.gameOver = true;}
        else{
            this.weekTillElection --;
            this.noActionProTurnPlayerOne = this.actionProTurnDefaultValue;
            for(int i=0; i < this.USA.size(); i++){
                this.USA.get(i).endTurnForState();
            }
            isHumanPlayerTurn = false;
            makeSITurn();
            for(int i=0; i < this.USA.size(); i++){
                this.USA.get(i).endTurnForState();
            }
            isHumanPlayerTurn = true;
            this.currentInfo = this.popularInfo[6];
            System.out.println(this.currentInfo.getinfo());
        }

    }

    protected boolean getFounds(){
        if(this.checkIfAbleToMakeSupportAction(-1) == true && this.chosenState.isRaisedFounds == false){
            this.moneyPlayerOne += this.chosenState.raiseFounds(player1.party);
            this.noActionProTurnPlayerOne--;
            return true;
        }
        else
            this.currentInfo = this.popularInfo[5];
            System.out.println(this.currentInfo.getinfo());
            return false;
    }

    protected boolean checkIfAbleToMakeSupportAction(int neededFounds){
        if(this.chosenState == null){
            this.currentInfo = this.popularInfo[0];
            System.out.println(this.currentInfo.getinfo());
            return false;
        }
        if(this.noActionProTurnPlayerOne <= 0){
            this.currentInfo = this.popularInfo[1];
            System.out.println(this.currentInfo.getinfo());
            return false;
        }
        if(this.moneyPlayerOne <= neededFounds){
            this.currentInfo = this.popularInfo[2];
            System.out.println(this.currentInfo.getinfo());
            return false;
        }
        else
            return true;
    }



    protected boolean visitState(){
        int costOfVisit = this.getCostOfVisit();
        if(this.checkIfAbleToMakeSupportAction(costOfVisit) == true && this.chosenState.isVisted == false){
            chosenState.visitState(App.GAME.player1.party);
            this.moneyPlayerOne -= costOfVisit;
            this.noActionProTurnPlayerOne--;
            return true;
        }
        else
            this.currentInfo = this.popularInfo[3];
            System.out.println(this.currentInfo.getinfo());
            return false;
    }

    protected int getCostOfVisit(){
        return this.chosenState.getCostOfVisit(this.player1.party);
    }

    protected boolean launchTVCampaign(){
        int costOfTVCampaign = this.getCostOfTVCampaign();
        if(this.checkIfAbleToMakeSupportAction(costOfTVCampaign) == true && this.chosenState.isLauchedCampaign == false){
            chosenState.launchTVCampaign(App.GAME.player1.party);
            this.moneyPlayerOne -= costOfTVCampaign;
            this.noActionProTurnPlayerOne--;
            return true;
        }
        else
        this.currentInfo = this.popularInfo[4];
            System.out.println(this.currentInfo.getinfo());
            return false;
    }

    protected int getCostOfTVCampaign(){
        return this.chosenState.getCostOfTVCampaign(this.player1.party);
    }

    //////////////SI PLAYER/////////////////

    protected void findStateToRaiseFounds(){
        int helper;
        int firstStateMoney = 0;
        State firstState = null;

        for(int i=0; i < this.USA.size(); i++){
                helper = this.USA.get(i).raiseFounds(player2.party);
                if(helper > firstStateMoney){
                    firstStateMoney = helper;
                    firstState = this.USA.get(i);
                }
                this.choosenBySI.add(firstState);
                this.moneyPlayerTwo += firstStateMoney;
        }
        System.out.println("została zebrane fundusze w" + firstState.name);
        
    }

    protected boolean chooseRandStateToVisit(){
        Random rand = new Random();
        ArrayList<State> statesTovisit = new ArrayList<State>();
        for(int i=0; i < this.USA.size(); i++){
            if(this.USA.get(i).getCostOfVisit(player2.party) < this.moneyPlayerTwo)
                if(this.USA.get(i).getPartySupportDiff(player2.party) < 0)
                    statesTovisit.add(this.USA.get(i));
        }
        if (statesTovisit.size() > 0){
            int randomInt = rand.nextInt(statesTovisit.size());
            State SIVisitedState = statesTovisit.get(randomInt);
            SIVisitedState.visitState(player2.party);
            this.moneyPlayerTwo -= SIVisitedState.getCostOfVisit(player2.party);
            this.choosenBySI.add(SIVisitedState);
            System.out.println("została przeprowadzona wizyta w" + SIVisitedState.name);
            return true;
        }
        else{
            findStateToRaiseFounds();
            return false;
        }

    }

    protected boolean chooseRandStateToTVCampaign(){
        Random rand = new Random();
        ArrayList<State> statesToLauchTV = new ArrayList<State>();
        for(int i=0; i < this.USA.size(); i++){
            if(this.USA.get(i).getCostOfTVCampaign(player2.party) < this.moneyPlayerTwo)
                if(this.USA.get(i).getPartySupportDiff(player2.party) < 0)
                    statesToLauchTV.add(this.USA.get(i));
        }
        if (statesToLauchTV.size() > 0){
            int randomInt = rand.nextInt(statesToLauchTV.size());
            State SILauchedTVCamState = statesToLauchTV.get(randomInt);
            SILauchedTVCamState.launchTVCampaign(player2.party);
            this.moneyPlayerTwo -= SILauchedTVCamState.getCostOfTVCampaign(player2.party);
            this.choosenBySI.add(SILauchedTVCamState);
            System.out.println("została wyswietlona kampania w " + SILauchedTVCamState.name);
            return true;
        }
        else{
            findStateToRaiseFounds();
            return false;
        }
 
    }

    protected void makeSITurn(){
        findStateToRaiseFounds();
        Random rand = new Random();
        int sequenceOfEvents = rand.nextInt(10);
        if (sequenceOfEvents % 3 == 0){
            chooseRandStateToTVCampaign();
            chooseRandStateToVisit();
        }
        else{
            chooseRandStateToVisit();
            chooseRandStateToTVCampaign();
        }
            
    }





}