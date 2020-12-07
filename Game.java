import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;

public class Game {
    ArrayList<State> USA = new ArrayList<State>();
    int daysTillElection;

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



    public static void main(String[] args){
        try{
            String[] dataStates = getDataFromFile();
            Game g = new Game();
            g.getUSListRandom(dataStates);
            for(int i=0; i < g.USA.size(); i++){
                System.out.println(g.USA.get((i)));
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Nie udało się otworzyć pliku z danymi");
        }
        
        
      }
}