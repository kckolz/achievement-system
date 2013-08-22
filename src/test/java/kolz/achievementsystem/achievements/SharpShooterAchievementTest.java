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
public class SharpShooterAchievementTest extends TestCase {


    /**
     * Test of getName method, of class SharpShooterAchievement.
     */
    public void testGetName() {
        System.out.println("getName");
        SharpShooterAchievement instance = new SharpShooterAchievement();
        String expResult = "Sharp Shooter";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasAchieved method, of class SharpShooterAchievement.
     */
    public void testHasAchieved() {
        System.out.println("hasAchieved");
        Player player = new Player("test", 1);
        player.getGameStats().setAttacks(100);
        player.getGameStats().setHits(75);
        SharpShooterAchievement instance = new SharpShooterAchievement();
        boolean expResult = true;
        boolean result = instance.hasAchieved(player);
        assertEquals(expResult, result);
    }

}
