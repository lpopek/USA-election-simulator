package USA_ELECTION_SIMULATOR;

import java.util.Random;


public class State {

    String id; 
    String name;
    double GOPSupport;
    double DEMSupport;
    int electoralVotes;
    int population;
    String stateType; 
    double DEMmomentum = 0;
    double GOPMomentum = 0;


    public State(String id, String name,  int electoralVotes, int population){
        this.id = id;
        this.name = name;
        this.electoralVotes = electoralVotes;
        this.population = population;
    }

    public String toString(){//overriding the toString() method  
        java.text.DecimalFormat df=new java.text.DecimalFormat();
        df.setMaximumFractionDigits(1);
        return this.id+" "+ this.name +" "+ this.stateType + " GOP support: " + df.format(100 * this.GOPSupport) + "%" + " DEM support: " + df.format(100 * this.DEMSupport) + "%";  
       }  

    public void setStateType(String stateType){
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
    public String checkSupport(){
        switch(this.stateType ){
            case "LD":
                return "D";
            case "D":
                return "D";
            case "R":
                return "R";
            case "LR":
                return "R";
            default:
                return null;
        }
    }

    protected void launchTVCampaign(String party){
        if (party == "D"){
            switch(this.stateType){
                    case "LD":
                        this.GOPSupport -= this.GOPSupport * 0.05;
                        break;
                    case "D":
                        this.GOPSupport -= this.GOPSupport * 0.06;
                        break;
                    case "R":
                        this.GOPSupport -= this.GOPSupport * 0.02;
                        break;
                    case "LR":
                        this.GOPSupport -= this.GOPSupport * 0.03;
                        break;
                    default:
                        this.GOPSupport -= this.GOPSupport * 0.04;
                }
        }
        else{
            switch(this.stateType){
                    case "LD":
                        this.DEMSupport -= DEMSupport * 0.03;
                        break;
                    case "D":
                        this.DEMSupport -= DEMSupport * 0.02;
                        break;
                    case "R":
                        this.DEMSupport -= DEMSupport * 0.06;
                        break;
                    case "LR":
                        this.DEMSupport -= DEMSupport * 0.05;
                        break;
                    default:
                        this.DEMSupport -= DEMSupport * 0.04;
                }
        }

    }

    protected int getCostOfTVCampaign(String party){
        int cost = 0;
        if (party == "D"){
            switch(this.stateType){
                    case "LD":
                        cost = (int) (0.28 * this.population);
                        return cost;
                    case "D":
                        cost = (int) (0.25 * this.population);
                        return cost;
                    case "R":
                        cost = (int) (0.4 * this.population);
                        return cost;
                    case "LR":
                        cost = (int) (0.36 * this.population);
                        return cost;
                    default:
                        cost = (int) (0.33 * this.population);
                        return cost;
                }
        }
        else{
            switch(this.stateType){
                    case "LD":
                        cost = (int) (0.36 * this.population);
                        return cost;
                    case "D":
                        cost = (int) (0.4 * this.population);
                        return cost;
                    case "R":
                        cost = (int) (0.25 * this.population);
                        return cost;
                    case "LR":
                        cost = (int) (0.28 * this.population);
                        return cost;
                    default:
                        cost = (int) (0.33 * this.population);
                        return cost;
                }
        }

    }

    protected void visitState(String party){
        double undecided = this.getUndecided();
        Random r = new Random();
        if (party == "D"){
            switch(this.stateType){
                    case "LD":
                        this.DEMSupport += undecided * r.nextDouble() * 0.4;
                        break;
                    case "D":
                        this.DEMSupport += undecided * r.nextDouble() * 0.5;
                        break;
                    case "R":
                        this.DEMSupport += undecided * r.nextDouble() * 0.1;
                        break;
                    case "LR":
                        this.DEMSupport += undecided * r.nextDouble() * 0.2;
                        break;
                    default:
                        this.DEMSupport += undecided * r.nextDouble() * 0.3;
                }
        }
        else{
            switch(this.stateType){
                    case "LD":
                        this.GOPSupport += undecided * r.nextDouble() * 0.2;
                        break;
                    case "D":
                        this.GOPSupport += undecided * r.nextDouble() * 0.1;
                        break;
                    case "R":
                        this.GOPSupport += undecided * r.nextDouble() * 0.5;
                        break;
                    case "LR":
                        this.GOPSupport += undecided * r.nextDouble() * 0.4;
                        break;
                    default:
                        this.GOPSupport += undecided * r.nextDouble() * 0.3;
                }
        }

    }


    protected int getCostOfVisit(String party){
        int cost = 0;
        if (party == "D"){
            switch(this.stateType){
                    case "LD":
                        cost = (int) ((this.getUndecided() + this.DEMSupport) * 0.28 * this.population);
                        return cost;
                    case "D":
                        cost = (int) ((this.getUndecided() + this.DEMSupport) * 0.25 * this.population);
                        return cost;
                    case "R":
                        cost = (int) ((this.getUndecided() + this.DEMSupport) * 0.4 * this.population);
                        return cost;
                    case "LR":
                        cost = (int) ((this.getUndecided() + this.DEMSupport) * 0.36 * this.population);
                        return cost;
                    default:
                        cost = (int) ((this.getUndecided() + this.DEMSupport) * 0.33 * this.population);
                        return cost;
                }
        }
        else{
            switch(this.stateType){
                    case "LD":
                        cost = (int) ((this.getUndecided() + this.GOPSupport) * 0.36 * this.population);
                        return cost;
                    case "D":
                        cost = (int) ((this.getUndecided() + this.GOPSupport) * 0.4 * this.population);
                        return cost;
                    case "R":
                        cost = (int) ((this.getUndecided() + this.GOPSupport) * 0.25 * this.population);
                        return cost;
                    case "LR":
                        cost = (int) ((this.getUndecided() + this.GOPSupport) * 0.28 * this.population);
                        return cost;
                    default:
                        cost = (int) ((this.getUndecided() + this.GOPSupport) * 0.33 * this.population);
                        return cost;
                }
        }
    }

    protected int raiseFounds(String party){
        int raisedMoney = 0;
        if (party == "D"){
            switch(this.stateType){
                    case "LD":
                        raisedMoney = (int) (this.DEMSupport * 0.8 * this.population);
                        return raisedMoney;
                    case "D":
                        raisedMoney = (int) (this.DEMSupport * this.population);
                        return raisedMoney;
                    case "R":
                        raisedMoney = (int) (this.DEMSupport * 0.2 * this.population);
                        return raisedMoney;
                    case "LR":
                        raisedMoney = (int) (this.DEMSupport * 0.4 * this.population);
                        return raisedMoney;
                    default:
                        raisedMoney = (int) (this.DEMSupport * 0.5 * this.population);
                        return raisedMoney;
                }
        }
        else{
            switch(this.stateType){
                    case "LD":
                        raisedMoney = (int) (this.GOPSupport * 0.4 * this.population);
                        return raisedMoney;
                    case "D":
                        raisedMoney = (int) (this.GOPSupport * 0.2 * this.population);
                        return raisedMoney;
                    case "R":
                        raisedMoney = (int) (this.GOPSupport * this.population);
                        return raisedMoney;
                    case "LR":
                        raisedMoney = (int) (this.GOPSupport * 0.8 * this.population);
                        return raisedMoney;
                    default:
                        raisedMoney = (int) (this.GOPSupport * 0.5 * this.population);
                        return raisedMoney;
                }
        }
    }


    public double getUndecided(){
        return 1 - this.DEMSupport - this.GOPSupport;
    }
    

  }