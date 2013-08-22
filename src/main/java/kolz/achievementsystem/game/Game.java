/*
 * This class is where the achievement engine is loaded from the spring context
 * and called. This is a simple class because there is no actual game logic that
 * we care about for this example except what happens when the game ends.
 */

package kolz.achievementsystem.game;

import java.util.ArrayList;
import java.util.List;
import kolz.achievementsystem.achievements.AchievementEngine;
import kolz.achievementsystem.player.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author kolz
 */
public class Game {



    private List<Player> players;
    private ApplicationContext context;
    private AchievementEngine achievementEngine;

    /*
     * When a game is created the application context is loaded to create the
     * achievement engine.
     */
    public Game() {
        this.players = new ArrayList<Player>();
        this.context = new FileSystemXmlApplicationContext("src/main/resources/spring/applicationContext.xml");
        this.achievementEngine = (AchievementEngine) context.getBean("AchievementEngine");

    }

    //Determine if the teams are even.
    public boolean areTeamsEven() {
        int team1 = 0;
        int team2 = 0;
        for(Player player : getPlayers()) {
            if(player.getTeam() == 1) team1++;
            else team2++;
        }
        if(team1 == team2) return true;
        else return false;
    }

    /*
     * This is the entry point for the achievement engine. This should be called
     * when the game ends in order to determine who earned achievements.
     */
    public void gameOver() {
        achievementEngine.processAchievements(players);
    }

    /**
     * @return the players
     */
    public List<Player> getPlayers() {
        return players;
    }


}
