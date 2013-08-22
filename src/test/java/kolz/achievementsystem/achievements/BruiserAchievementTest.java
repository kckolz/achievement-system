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
public class BruiserAchievementTest extends TestCase {
    

    /**
     * Test of getName method, of class BruiserAchievement.
     */
    public void testGetName() {
        System.out.println("getName");
        BruiserAchievement instance = new BruiserAchievement();
        String expResult = "Bruiser";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasAchieved method, of class BruiserAchievement.
     */
    public void testHasAchieved() {
        System.out.println("hasAchieved");
        Player player = new Player("test", 1);
        player.getGameStats().setDamage(1000);
        BruiserAchievement instance = new BruiserAchievement();
        boolean expResult = true;
        boolean result = instance.hasAchieved(player);
        assertEquals(expResult, result);
    }

}
