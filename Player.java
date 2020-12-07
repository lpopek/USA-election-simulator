public class Player {
    String name;
    String surname;
    String party;

    public  Player(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void setParty(int type){
        if(type == 1){
            this.party = "GOP";
        }
        else
            this.party = "DEM";
    }
}
