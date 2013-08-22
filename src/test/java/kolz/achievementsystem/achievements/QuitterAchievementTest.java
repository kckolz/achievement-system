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
public class QuitterAchievementTest extends TestCase {

    /**
     * Test of getName method, of class QuitterAchievement.
     */
    public void testGetName() {
        System.out.println("getName");
        QuitterAchievement instance = new QuitterAchievement();
        String expResult = "Quitter";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasAchieved method, of class QuitterAchievement.
     */
    public void testHasAchieved() {
        System.out.println("hasAchieved");
        Player player = new Player("test", 1);
        player.getHistoricalStats().setGamesLeft(75);
        player.getHistoricalStats().setGamesPlayed(100);
        QuitterAchievement instance = new QuitterAchievement();
        boolean expResult = true;
        boolean result = instance.hasAchieved(player);
    }

}
