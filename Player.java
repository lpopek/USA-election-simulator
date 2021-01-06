
public class Player {
    String name;
    String surname;
    String party;
    int founds = 100;

    public Player(String name, String surname, String party ) {
        this.name = name;
        this.surname = surname;
        this.party = party;
    }
    
    public void makeVisit(State state){
        state.changeSupport(this.party);
    }
    public void getFounds(){
        this.founds += 20;
    }
}
