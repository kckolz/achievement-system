/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kolz.achievementsystem.game;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class GameTest extends TestCase {
    

    /**
     * Test of areTeamsEven method, of class Game.
     */
    public void testAreTeamsEven_TRUE() {
        System.out.println("areTeamsEven");
        Game instance = createEvenGame();
        boolean expResult = true;
        boolean result = instance.areTeamsEven();
        assertEquals(expResult, result);
    }

    public void testAreTeamsEven_FALSE() {
        System.out.println("areTeamsEven");
        Game instance = createUnevenGame();
        boolean expResult = false;
        boolean result = instance.areTeamsEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = new Game();
        List expResult = new ArrayList<Player>();
        List result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    private Game createEvenGame() {
        Game game = new Game();
        Player player1 = new Player("Kevin",1);
        Player player2 = new Player("Scott",1);
        Player player3 = new Player("Joey",1);
        Player player4 = new Player("Toby",2);
        Player player5 = new Player("John",2);
        Player player6 = new Player("Bob",2);
        game.getPlayers().add(player1);
        game.getPlayers().add(player2);
        game.getPlayers().add(player3);
        game.getPlayers().add(player4);
        game.getPlayers().add(player5);
        game.getPlayers().add(player6);
        return game;
    }

    private Game createUnevenGame() {
        Game game = new Game();
        Player player1 = new Player("Kevin",1);
        Player player2 = new Player("Scott",1);
        Player player3 = new Player("Joey",1);
        Player player4 = new Player("Toby",2);
        Player player5 = new Player("John",2);

        game.getPlayers().add(player1);
        game.getPlayers().add(player2);
        game.getPlayers().add(player3);
        game.getPlayers().add(player4);
        game.getPlayers().add(player5);

        return game;
    }

}
