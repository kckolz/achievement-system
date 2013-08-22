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
public class BigWinnerAchievementTest extends TestCase {
    

    /**
     * Test of getName method, of class BigWinnerAchievement.
     */
    public void testGetName() {
        System.out.println("getName");
        BigWinnerAchievement instance = new BigWinnerAchievement();
        String expResult = "Big Winner";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasAchieved method, of class BigWinnerAchievement.
     */
    public void testHasAchieved() {
        System.out.println("hasAchieved");
        Player player = new Player("test", 1);
        player.getHistoricalStats().setWins(250);
        BigWinnerAchievement instance = new BigWinnerAchievement();
        boolean expResult = true;
        boolean result = instance.hasAchieved(player);
        assertEquals(expResult, result);
    }

}
