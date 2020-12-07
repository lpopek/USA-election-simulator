//Issues with importing org.junit
//Currently necesarry to be placed in the local folder with src files
//Not uploaded to git

import static org.junit.Assert.*;


import org.junit.Test;

public class Tests {
    @Test
    public void testPlayer() {
        Player player = new Player("Name", "Surname");
        assertEquals("Name", player.name);
        assertEquals("Surname", player.surname);
        assertNull(player.party);
        player.setParty(1);
        assertEquals("GOP", player.party);
        player.setParty(0);
        assertEquals("DEM", player.party);        
    }
    @Test //failed. lets name and surname be empty
    public void testPlayerEmptyName() {
        boolean except = false;
        try {
            Player player = new Player("", "");
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