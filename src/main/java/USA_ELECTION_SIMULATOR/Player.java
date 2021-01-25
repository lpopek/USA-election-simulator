package USA_ELECTION_SIMULATOR;

public class Player {
    String name;
    String surname;
    String party;
    State homeState;

    public Player(String name, String surname, String party ) {
        this.name = name;
        this.surname = surname;
        this.party = party;
    }

    protected void setRepublican(){this.party = "R";}
    protected void setDemocrat(){this.party = "D";}
}
