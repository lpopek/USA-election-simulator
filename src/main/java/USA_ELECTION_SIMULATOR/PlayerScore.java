package USA_ELECTION_SIMULATOR;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PlayerScore {
    private SimpleIntegerProperty score;
    private SimpleStringProperty name;
    private SimpleStringProperty party;

    public PlayerScore(Integer score, String name, String party) {
        this.score = new SimpleIntegerProperty(score);
        this.name = new SimpleStringProperty(name);
        this.party = new SimpleStringProperty(party);
    }

    public int getScore() {
        return score.get();
    }

    public void setScore(int score) {
        this.score = new SimpleIntegerProperty(score);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getParty() {
        return party.get();
    }

    public void setParty(String party) {
        this.party = new SimpleStringProperty(party);
    }
}
