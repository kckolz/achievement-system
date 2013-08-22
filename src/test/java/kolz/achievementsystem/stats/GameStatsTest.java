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
public class GameStatsTest extends TestCase {
    
    /**
     * Test of getAttacks method, of class GameStats.
     */
    public void testGetAttacks() {
        System.out.println("getAttacks");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getAttacks();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAttacks method, of class GameStats.
     */
    public void testSetAttacks() {
        System.out.println("setAttacks");
        int attacks = 1;
        GameStats instance = new GameStats();
        instance.setAttacks(attacks);
        int expResult = 1;
        int result = instance.getAttacks();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHits method, of class GameStats.
     */
    public void testGetHits() {
        System.out.println("getHits");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getHits();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHits method, of class GameStats.
     */
    public void testSetHits() {
        System.out.println("setHits");
        int hits = 1;
        GameStats instance = new GameStats();
        instance.setHits(hits);
        int expResult = 1;
        int result = instance.getHits();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDamage method, of class GameStats.
     */
    public void testGetDamage() {
        System.out.println("getDamage");
        GameStats instance = new GameStats();
        long expResult = 0L;
        long result = instance.getDamage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDamage method, of class GameStats.
     */
    public void testSetDamage() {
        System.out.println("setDamage");
        long damage = 1L;
        GameStats instance = new GameStats();
        instance.setDamage(damage);
        long expResult = 1L;
        long result = instance.getDamage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKills method, of class GameStats.
     */
    public void testGetKills() {
        System.out.println("getKills");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getKills();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKills method, of class GameStats.
     */
    public void testSetKills() {
        System.out.println("setKills");
        int kills = 1;
        GameStats instance = new GameStats();
        instance.setKills(kills);
        int expResult = 1;
        int result = instance.getKills();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirstHitKill method, of class GameStats.
     */
    public void testGetFirstHitKill() {
        System.out.println("getFirstHitKill");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getFirstHitKill();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstHitKill method, of class GameStats.
     */
    public void testSetFirstHitKill() {
        System.out.println("setFirstHitKill");
        int firstHitKill = 1;
        GameStats instance = new GameStats();
        instance.setFirstHitKill(firstHitKill);
        int expResult = 1;
        int result = instance.getFirstHitKill();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAssists method, of class GameStats.
     */
    public void testGetAssists() {
        System.out.println("getAssists");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getAssists();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAssists method, of class GameStats.
     */
    public void testSetAssists() {
        System.out.println("setAssists");
        int assists = 1;
        GameStats instance = new GameStats();
        instance.setAssists(assists);
        int expResult = 1;
        int result = instance.getAssists();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCasts method, of class GameStats.
     */
    public void testGetCasts() {
        System.out.println("getCasts");
        GameStats instance = new GameStats();
        int expResult = 0;
        int result = instance.getCasts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCasts method, of class GameStats.
     */
    public void testSetCasts() {
        System.out.println("setCasts");
        int casts = 1;
        GameStats instance = new GameStats();
        instance.setCasts(casts);
        int expResult = 1;
        int result = instance.getCasts();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSpellDamage method, of class GameStats.
     */
    public void testGetSpellDamage() {
        System.out.println("getSpellDamage");
        GameStats instance = new GameStats();
        long expResult = 0L;
        long result = instance.getSpellDamage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSpellDamage method, of class GameStats.
     */
    public void testSetSpellDamage() {
        System.out.println("setSpellDamage");
        long spellDamage = 1L;
        GameStats instance = new GameStats();
        instance.setSpellDamage(spellDamage);
        long expResult = 1L;
        long result = instance.getSpellDamage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimePlayed method, of class GameStats.
     */
    public void testGetTimePlayed() {
        System.out.println("getTimePlayed");
        GameStats instance = new GameStats();
        long expResult = 0L;
        long result = instance.getTimePlayed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimePlayed method, of class GameStats.
     */
    public void testSetTimePlayed() {
        System.out.println("setTimePlayed");
        long timePlayed = 1L;
        GameStats instance = new GameStats();
        instance.setTimePlayed(timePlayed);
        long expResult = 1L;
        long result = instance.getTimePlayed();
        assertEquals(expResult, result);
    }

}
