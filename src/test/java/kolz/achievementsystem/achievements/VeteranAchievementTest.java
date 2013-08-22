/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kolz.achievementsystem.achievements;

import junit.framework.TestCase;
import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class VeteranAchievementTest extends TestCase {
    

    /**
     * Test of getName method, of class VeteranAchievement.
     */
    public void testGetName() {
        System.out.println("getName");
        VeteranAchievement instance = new VeteranAchievement();
        String expResult = "Veteran";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasAchieved method, of class VeteranAchievement.
     */
    public void testHasAchieved() {
        System.out.println("hasAchieved");
        Player player = new Player("test", 1);
        player.getHistoricalStats().setGamesPlayed(2000);
        VeteranAchievement instance = new VeteranAchievement();
        boolean expResult = true;
        boolean result = instance.hasAchieved(player);
        assertEquals(expResult, result);
    }

}
