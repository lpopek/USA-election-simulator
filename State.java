import java.util.Random;

public class State {

    String id; 
    String name;
    double GOPSupport;
    double DEMSupport;
    int electoralVotes;
    String stateType; 

    public State(String id, String name,  int electoralVotes){
        /**
 * This is constructor of class state.
 * @id - id of state (string)
 * @name - name of state (string)
 * @electoralVotes - sets number of electoral votes
 */
        this.id = id;
        this.name = name;
        this.electoralVotes = electoralVotes;
    }

    public String toString(){//overriding the toString() method  
        java.text.DecimalFormat df=new java.text.DecimalFormat();
        df.setMaximumFractionDigits(1);
        return this.id+" "+ this.name +" "+ this.stateType + " GOP support: " + df.format(100 * this.GOPSupport) + "%" + " DEM support: " + df.format(100 * this.DEMSupport) + "%";  
       }  

    public void setStateType(String stateType){
         /**
 * This is setter of class state type 
 * @stateType - define influecnce of player decision there are 5 types of states - D (democratic), LD(leaning to democrats), S (swing), LR(leaninto Rep), R(Rrepublican)
 */
        this.stateType = stateType;
    }

    public void getRandomSupport(){
        Random r = new Random();
        this.DEMSupport = 0.3 + r.nextDouble() * 0.20;
        this.GOPSupport = 0.3 + r.nextDouble() * 0.20;
    }

    public void getRandomType(){
        String[]tab = new String[5];
        tab[0] = "D";
        tab[1] = "LD";
        tab[2] = "S";
        tab[3] = "LR";
        tab[4] = "R";
        Random r = new Random();
        this.stateType = tab[r.nextInt(5)];
    }

    public double getUndecided(){
        return 1 - this.DEMSupport - this.GOPSupport;
    }
    

  }