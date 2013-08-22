/*
 * This class represents the player. The player has stats, achievements, a name,
 * and a team. 
 */

package kolz.achievementsystem.player;

import java.util.ArrayList;
import java.util.List;
import kolz.achievementsystem.achievements.Achievement;
import kolz.achievementsystem.stats.GameStats;
import kolz.achievementsystem.stats.HistoricalStats;

/**
 *
 * @author kolz
 */
public class Player {
    private GameStats gameStats;
    private HistoricalStats historicalStats;
    private List<Achievement> achievements;
    private String name;
    private int team;

    public Player(String name, int team) {
        this.name = name;
        this.team = team;
        gameStats = new GameStats();
        historicalStats = new HistoricalStats();
        this.achievements = new ArrayList<Achievement>();
    }

    /**
     * @return the gameStats
     */
    public GameStats getGameStats() {
        return gameStats;
    }

    /**
     * @param gameStats the gameStats to set
     */
    public void setGameStats(GameStats gameStats) {
        this.gameStats = gameStats;
    }

    /**
     * @return the historicalStats
     */
    public HistoricalStats getHistoricalStats() {
        return historicalStats;
    }

    /**
     * @param historicalStats the historicalStats to set
     */
    public void setHistoricalStats(HistoricalStats historicalStats) {
        this.historicalStats = historicalStats;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the team
     */
    public int getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(int team) {
        this.team = team;
    }

    /**
     * @return the achievements
     */
    public List<Achievement> getAchievements() {
        return achievements;
    }

}
