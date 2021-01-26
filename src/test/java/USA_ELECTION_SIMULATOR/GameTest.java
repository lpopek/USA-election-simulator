package USA_ELECTION_SIMULATOR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;

public class GameTest {
    @Test
    public void testCountState() throws FileNotFoundException {
        Game game = new Game();
        game.player.setRepublican();
        int votes = game.countVotes();
        int votesChecked = 0;
        for(int i=0; i < game.USA.size(); i++){
            State s = game.USA.get((i));
            if (s.DEMSupport < s.GOPSupport){votesChecked += s.electoralVotes;}
        }
        assertEquals(votesChecked, votes);
    }
}
