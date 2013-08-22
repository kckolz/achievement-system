/*
 * This is the interface for all of the achievements
 */

package kolz.achievementsystem.achievements;

import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public interface Achievement {

    public String getName();

    public boolean hasAchieved(Player player);

}
