/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kolz.achievementsystem.achievements;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import kolz.achievementsystem.player.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author kolz
 */
public class AchievementEngineTest extends TestCase {

    private ApplicationContext context;
    
    public AchievementEngineTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        this.context = new FileSystemXmlApplicationContext("src/main/resources/spring/applicationContext.xml");

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of processAchievements method, of class AchievementEngine.
     */
    public void testProcessAchievements() {
        System.out.println("processAchievements");
        List<Player> players = createPlayers();
        AchievementEngine instance = (AchievementEngine) context.getBean("AchievementEngine");
        instance.processAchievements(players);
        assertFalse(players.get(0).getAchievements().isEmpty());
        assertFalse(players.get(1).getAchievements().isEmpty());
    }


    private List<Player> createPlayers() {
        List<Player> players = new ArrayList<Player>();
        Player player1 = new Player("Player 1", 1);
        Player player2 = new Player("Player 2", 2);
        player1.getGameStats().setDamage(600);
        player1.getGameStats().setAttacks(100);
        player1.getGameStats().setHits(76);
        players.add(player1);
        player2.getHistoricalStats().setGamesLeft(600);
        player2.getHistoricalStats().setGamesPlayed(1001);
        player2.getHistoricalStats().setWins(239);
        players.add(player2);
        return players;
    }

}
