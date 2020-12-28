package USA_ELECTION_SIMULATOR;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    ArrayList<State> USA = new ArrayList<State>();
    int daysTillElection = 5;
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
        if (isFound == false){
            System.out.println("Podano zły napis spróbuj jesscze raz, ale tą kolejke straciłeś");
            return null;
        }
        this.USA.remove(helper);
        return helper;
    }

    public void finishTurn(){
        System.out.println("Tura numer: "+ this.daysTillElection);
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
            Player p = new Player("Donald", "Trump", "GOP");
            System.out.println("Witaj " + p.name+" ! Życymy powodzenia");
            Scanner scan = new Scanner(System.in);
            while(g.gameOver == false){
                System.out.println("Wybierz akcje:\n 1 - zbierz fundusze 2 - przeprowadź wizytę");
                int choice = scan.nextInt();
                scan.nextLine();
                if (choice == 1){
                    p.getFounds();
                }
                else{
                    if(p.founds - 20 < 0){
                        System.out.println("za mało funduszy. Za oszustwo wyborcze tracisz turę!");
                    }
                    else{
                        System.out.println("Wprowdź ID stanu w któym chesz przeprowadzić wiec wyborczy");
                        for(int i = 0; i < g.USA.size(); i++){
                            State helper = g.USA.get(i);
                            System.out.println(helper.name + " " + helper.id);
                        }
                        String stateId = scan.nextLine();
                        State chosenState = g.chooseStateByID(stateId);
                        if (chosenState != null){
                            System.out.println("Tak wygladał stan przed wizytą");
                            System.out.println(chosenState);
                            p.makeVisit(chosenState);
                            System.out.println("Tak wygladał stan po wizycie");
                            System.out.println(chosenState);
                            g.USA.add(chosenState);
                        }
                        
                    }
                }
                
                g.finishTurn();
            }
            scan.close();

        }
        catch(FileNotFoundException e){
            System.out.println("Nie udało się otworzyć pliku z danymi");
        }
        
        
      }
}