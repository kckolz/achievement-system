/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kolz.achievementsystem;

import junit.framework.TestCase;
import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class StatsLoaderTest extends TestCase {


    /**
     * Test of loadGameStats method, of class StatsLoader.
     */
    public void testLoadGameStats() throws Exception {
        System.out.println("loadGameStats");
        Player player = new Player("test", 1);
        StatsLoader.loadGameStats(player);
        assertTrue(player.getGameStats().getAssists() != 0);
        assertTrue(player.getGameStats().getAttacks() != 0);
        assertTrue(player.getGameStats().getCasts() != 0);
        assertTrue(player.getGameStats().getDamage() != 0);
        assertTrue(player.getGameStats().getFirstHitKill() != 0);
        assertTrue(player.getGameStats().getHits() != 0);
        assertTrue(player.getGameStats().getKills() != 0);
        assertTrue(player.getGameStats().getSpellDamage() != 0);
        assertTrue(player.getGameStats().getTimePlayed() != 0);
    }

    /**
     * Test of loadHistoricalStats method, of class StatsLoader.
     */
    public void testLoadHistoricalStats() throws Exception {
        System.out.println("loadHistoricalStats");
        Player player = new Player("test", 1);
        StatsLoader.loadHistoricalStats(player);
        assertTrue(player.getHistoricalStats().getGamesLeft() != 0);
        assertTrue(player.getHistoricalStats().getGamesPlayed() != 0);
        assertTrue(player.getHistoricalStats().getKills() != 0);
        assertTrue(player.getHistoricalStats().getLosses() != 0);
        assertTrue(player.getHistoricalStats().getTimePlayed() != 0);
        assertTrue(player.getHistoricalStats().getWins() != 0);
    }

}
