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
        game.noActionProTurn--;
        game.finishTurn();
        assertEquals(4, game.noActionProTurn);
    }
    @Test
    public void testCheckIfAbleToMakeSupportAction() throws FileNotFoundException {
        Game game = new Game();
        assertNull(game.chosenState);
        boolean v = game.checkIfAbleToMakeSupportAction(1000);
        assertFalse(v);
        game.chosenState = game.USA.get(0);
        game.noActionProTurn = 0;
        v = game.checkIfAbleToMakeSupportAction(1000);
        assertFalse(v);
        game.noActionProTurn = 3;
        game.money = 2000;
        v = game.checkIfAbleToMakeSupportAction(1400);
        assertTrue(v);
    }

}
