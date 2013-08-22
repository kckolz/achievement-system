/*
 * This is where the achievements are processed. This class is used at the end
 * of a game to figure out what players have earned achievements.
 */

package kolz.achievementsystem.achievements;

import java.util.List;
import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class AchievementEngine {

    //This will be populated by spring
    private List<Achievement> achievements;

    public AchievementEngine() {

    }

    //Go through each player and call the achievements hasAchieved method on them.
    public void processAchievements(List<Player> players) {
        for(Player player : players) {
            for(Achievement achievement : achievements) {
                if(achievement.hasAchieved(player)) {
                    System.out.println("Player "+player.getName()+" has earned the "+achievement.getName()+" achievement");
                    player.getAchievements().add(achievement);
                }
            }
        }
    }

    /**
     * @return the achievements
     */
    public List<Achievement> getAchievements() {
        return achievements;
    }

    /**
     * @param achievements the achievements to set
     */
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

}
