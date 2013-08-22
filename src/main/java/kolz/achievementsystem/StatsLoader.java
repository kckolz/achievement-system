/*
 * This class will load fake stats from text files. The stats are static and
 * only meant for test purposes
 */
package kolz.achievementsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class StatsLoader {

    private static BufferedReader gameStatsReader;
    private static BufferedReader historicalStatsReader;

    public StatsLoader() {}


    /*
     * Stats loader uses this method to read in a text file and fill the player
     * with game stats from the file.
     */
    public static void loadGameStats(Player player) throws FileNotFoundException {
        gameStatsReader = new BufferedReader(new FileReader("src/main/resources/stats/gamestats.txt"));
        try {
            player.getGameStats().setAttacks(Integer.parseInt(gameStatsReader.readLine()));
            player.getGameStats().setHits(Integer.parseInt(gameStatsReader.readLine()));
            player.getGameStats().setDamage(Long.parseLong(gameStatsReader.readLine()));
            player.getGameStats().setKills(Integer.parseInt(gameStatsReader.readLine()));
            player.getGameStats().setFirstHitKill(Integer.parseInt(gameStatsReader.readLine()));
            player.getGameStats().setAssists(Integer.parseInt(gameStatsReader.readLine()));
            player.getGameStats().setCasts(Integer.parseInt(gameStatsReader.readLine()));
            player.getGameStats().setSpellDamage(Long.parseLong(gameStatsReader.readLine()));
            player.getGameStats().setTimePlayed(Long.parseLong(gameStatsReader.readLine()));

        } catch (IOException ex) {
            Logger.getLogger(StatsLoader.class.getName()).log(Level.SEVERE, "Cannot find specificed stats file", ex);
        }
    }

    /*
     * Stats loader uses this method to read in a text file and fill the player
     * with historical stats from the file.
     */
    public static void loadHistoricalStats(Player player) throws FileNotFoundException {
        historicalStatsReader = new BufferedReader(new FileReader("src/main/resources/stats/historicalstats.txt"));
        try {
            player.getHistoricalStats().setWins(Integer.parseInt(historicalStatsReader.readLine()));
            player.getHistoricalStats().setLosses(Integer.parseInt(historicalStatsReader.readLine()));
            player.getHistoricalStats().setGamesPlayed(Integer.parseInt(historicalStatsReader.readLine()));
            player.getHistoricalStats().setTimePlayed(Integer.parseInt(historicalStatsReader.readLine()));
            player.getHistoricalStats().setKills(Integer.parseInt(historicalStatsReader.readLine()));
            player.getHistoricalStats().setGamesLeft(Integer.parseInt(historicalStatsReader.readLine()));

        } catch (IOException ex) {
            Logger.getLogger(StatsLoader.class.getName()).log(Level.SEVERE, "Cannot find specificed stats file", ex);
        }
    }
}
