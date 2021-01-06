package USA_ELECTION_SIMULATOR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    @Test
    public void testPlayer() {
        Player player = new Player("Name", "Surname","R");
        assertEquals("Name", player.name);
        assertEquals("Surname", player.surname);
        assertEquals("R", player.party);     
    }
    @Test //failed. lets name and surname be empty
    public void testPlayerEmptyName() {
        boolean except = false;
        try {
            Player player = new Player("", "","");
        }
        catch (Exception e)
        {
            except = true;
        }
        assertTrue(except);
    }

    @Test
    public void testStateType() {
        State california = new State("CA", "California", 55);
        assertNull(california.stateType);
        california.setStateType("R");
        assertEquals("R", california.stateType);
    }

    @Test
    public void testStateRandomSupport() {
        State california = new State("CA", "California", 55);
        california.getRandomSupport();
        assertTrue(0.3 <= california.GOPSupport && california.GOPSupport <= 1.0);
        assertTrue(0.3 <= california.DEMSupport && california.DEMSupport <= 1.0);
    }
    @Test
    public void testStateRandomType() {
        State california = new State("CA", "California", 55);
        String[] values = {"D", "LD", "S", "LR", "R"};
        california.getRandomType();
        boolean isIn = false;
        for (String element : values) {
            if (element == california.stateType) {
                isIn = true;
            }
        }
        assertTrue(isIn);
    }
    @Test
    public void testGetUndecided() {
        State california = new State("CA", "California", 55);
        assertEquals(1, california.getUndecided(), 0.0001);
    }

    
    
}

