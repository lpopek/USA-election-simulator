package USA_ELECTION_SIMULATOR;



public class Comunnication {
    String content;
    String type;
    String[] possibleType = {"INFO", "WARNING" };

    protected Comunnication(String content, int typeNO) {
        this.content = content;
        this.type = this.possibleType[typeNO];
    }

    protected String getinfo(){
        return this.type + ": " + this.content;
    }
}
