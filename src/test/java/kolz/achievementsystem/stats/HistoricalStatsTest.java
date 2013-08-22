/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kolz.achievementsystem.stats;

import junit.framework.TestCase;

/**
 *
 * @author kolz
 */
public class HistoricalStatsTest extends TestCase {


    /**
     * Test of getWins method, of class HistoricalStats.
     */
    public void testGetWins() {
        System.out.println("getWins");
        HistoricalStats instance = new HistoricalStats();
        int expResult = 0;
        int result = instance.getWins();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWins method, of class HistoricalStats.
     */
    public void testSetWins() {
        System.out.println("setWins");
        int wins = 1;
        HistoricalStats instance = new HistoricalStats();
        instance.setWins(wins);
        int expResult = 1;
        int result = instance.getWins();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLosses method, of class HistoricalStats.
     */
    public void testGetLosses() {
        System.out.println("getLosses");
        HistoricalStats instance = new HistoricalStats();
        int expResult = 0;
        int result = instance.getLosses();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLosses method, of class HistoricalStats.
     */
    public void testSetLosses() {
        System.out.println("setLosses");
        int losses = 1;
        HistoricalStats instance = new HistoricalStats();
        instance.setLosses(losses);
        int expResult = 1;
        int result = instance.getLosses();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGamesPlayed method, of class HistoricalStats.
     */
    public void testGetGamesPlayed() {
        System.out.println("getGamesPlayed");
        HistoricalStats instance = new HistoricalStats();
        int expResult = 0;
        int result = instance.getGamesPlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGamesPlayed method, of class HistoricalStats.
     */
    public void testSetGamesPlayed() {
        System.out.println("setGamesPlayed");
        int gamesPlayed = 1;
        HistoricalStats instance = new HistoricalStats();
        instance.setGamesPlayed(gamesPlayed);
        int expResult = 1;
        int result = instance.getGamesPlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimePlayed method, of class HistoricalStats.
     */
    public void testGetTimePlayed() {
        System.out.println("getTimePlayed");
        HistoricalStats instance = new HistoricalStats();
        int expResult = 0;
        int result = instance.getTimePlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimePlayed method, of class HistoricalStats.
     */
    public void testSetTimePlayed() {
        System.out.println("setTimePlayed");
        int timePlayed = 1;
        HistoricalStats instance = new HistoricalStats();
        instance.setTimePlayed(timePlayed);
        int expResult = 1;
        int result = instance.getTimePlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKills method, of class HistoricalStats.
     */
    public void testGetKills() {
        System.out.println("getKills");
        HistoricalStats instance = new HistoricalStats();
        int expResult = 0;
        int result = instance.getKills();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKills method, of class HistoricalStats.
     */
    public void testSetKills() {
        System.out.println("setKills");
        int kills = 1;
        HistoricalStats instance = new HistoricalStats();
        instance.setKills(kills);
        int expResult = 1;
        int result = instance.getKills();
        assertEquals(expResult, result);
    }

}
