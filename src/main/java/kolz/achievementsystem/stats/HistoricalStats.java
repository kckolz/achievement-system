/*
 * This class represents stats the stay with a character for their lifetime.
 */

package kolz.achievementsystem.stats;


/**
 *
 * @author kolz
 */
public class HistoricalStats{

    private int wins;
    private int losses;
    private int gamesPlayed;
    private int timePlayed;
    private int kills;
    private int gamesLeft;

    public HistoricalStats() {}

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @param losses the losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * @return the gamesPlayed
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the gamesPlayed to set
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * @return the timePlayed
     */
    public int getTimePlayed() {
        return timePlayed;
    }

    /**
     * @param timePlayed the timePlayed to set
     */
    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    /**
     * @return the kills
     */
    public int getKills() {
        return kills;
    }

    /**
     * @param kills the kills to set
     */
    public void setKills(int kills) {
        this.kills = kills;
    }

    /**
     * @return the gamesLeft
     */
    public int getGamesLeft() {
        return gamesLeft;
    }

    /**
     * @param gamesLeft the gamesLeft to set
     */
    public void setGamesLeft(int gamesLeft) {
        this.gamesLeft = gamesLeft;
    }

}
