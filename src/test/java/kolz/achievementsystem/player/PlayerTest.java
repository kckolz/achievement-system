/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kolz.achievementsystem.player;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import kolz.achievementsystem.achievements.Achievement;
import kolz.achievementsystem.achievements.BruiserAchievement;

import kolz.achievementsystem.stats.GameStats;
import kolz.achievementsystem.stats.HistoricalStats;

/**
 *
 * @author kolz
 */
public class PlayerTest extends TestCase {
    
    public PlayerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    /**
     * Test of getGameStats method, of class Player.
     */
    public void testGetGameStats() {
        System.out.println("getGameStats");
        Player instance = new Player("test", 1);
        GameStats stats = new GameStats();
        instance.setGameStats(stats);
        GameStats expResult = stats;
        GameStats result = instance.getGameStats();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGameStats method, of class Player.
     */
    public void testSetGameStats() {
        System.out.println("setGameStats");
        GameStats gameStats = new GameStats();
        Player instance = new Player("test", 1);
        instance.setGameStats(gameStats);
        GameStats expResult = gameStats;
        GameStats result = instance.getGameStats();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHistoricalStats method, of class Player.
     */
    public void testGetHistoricalStats() {
        System.out.println("getHistoricalStats");
        Player instance = new Player("test", 1);
        HistoricalStats stats = new HistoricalStats();
        instance.setHistoricalStats(stats);
        HistoricalStats expResult = stats;
        HistoricalStats result = instance.getHistoricalStats();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHistoricalStats method, of class Player.
     */
    public void testSetHistoricalStats() {
        System.out.println("setHistoricalStats");
        HistoricalStats historicalStats = new HistoricalStats();
        Player instance = new Player("test", 1);
        instance.setHistoricalStats(historicalStats);
        HistoricalStats expResult = historicalStats;
        HistoricalStats result = instance.getHistoricalStats();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Player.
     */
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player("test", 1);
        String expResult = "test";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Player.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "test";
        Player instance = new Player("test", 1);
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
    }

    /**
     * Test of getTeam method, of class Player.
     */
    public void testGetTeam() {
        System.out.println("getTeam");
        Player instance = new Player("test", 1);
        int expResult = 1;
        int result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeam method, of class Player.
     */
    public void testSetTeam() {
        System.out.println("setTeam");
        int expResult = 1;
        Player instance = new Player("test", 1);
        instance.setTeam(expResult);
        int result = instance.getTeam();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAchievements method, of class Player.
     */
    public void testGetAchievements() {
        System.out.println("getAchievements");
        Player instance = new Player("test", 1);
        BruiserAchievement bruiserAchievement = new BruiserAchievement();
        instance.getAchievements().add(bruiserAchievement);
        List result = instance.getAchievements();
        assertTrue(result.contains(bruiserAchievement));
    }

}
