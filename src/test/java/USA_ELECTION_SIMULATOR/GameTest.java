package USA_ELECTION_SIMULATOR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.FileNotFoundException;

public class GameTest {
    @Test
    public void testCountState() throws FileNotFoundException {
        Game game = new Game();
        game.player1.setRepublican();
        int votes = game.countVotes();
        int votesChecked = 0;
        for(int i=0; i < game.USA.size(); i++){
            State s = game.USA.get((i));
            if (s.DEMSupport < s.GOPSupport){votesChecked += s.electoralVotes;}
        }
        assertEquals(votesChecked, votes);
    }
    @Test
    public void testCommunicates() throws FileNotFoundException {
        Game game = new Game();
        String s1 = game.popularInfo[0].getinfo();
        assertEquals("WARNING: Choose state", s1);
        String s2 = game.popularInfo[1].getinfo();
        assertEquals("WARNING: Too many actions in current round", s2);
    }

    @Test 
    public void testFinishTurn() throws FileNotFoundException {
        Game game = new Game();
        game.weekTillElection = 0;
        game.finishTurn();
        assertTrue(game.gameOver);
        game.weekTillElection = 3;
        game.finishTurn();
        assertEquals(2, game.weekTillElection);
        game.noActionProTurnPlayerOne--;
        game.finishTurn();
        assertEquals(3, game.noActionProTurnPlayerOne);
    }
    @Test
    public void testCheckIfAbleToMakeSupportAction() throws FileNotFoundException {
        Game game = new Game();
        assertNull(game.chosenState);
        boolean v = game.checkIfAbleToMakeSupportAction(1000);
        assertFalse(v);
        game.chosenState = game.USA.get(0);
        game.noActionProTurnPlayerOne = 0;
        v = game.checkIfAbleToMakeSupportAction(1000);
        assertFalse(v);
        game.noActionProTurnPlayerOne = 3;
        game.moneyPlayerOne = 2000;
        v = game.checkIfAbleToMakeSupportAction(1400);
        assertTrue(v);
    }
    @Test
    public void testCoutElectVotes() throws FileNotFoundException {
        Game game = new Game();
        int noElectVotes = 0;
        for(int i=0; i < game.USA.size(); i++){
            State s = game.USA.get((i));
            noElectVotes += s.electoralVotes;
        }
        assertEquals(538, noElectVotes);
    }

}
