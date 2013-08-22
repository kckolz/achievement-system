package kolz.achievementsystem;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kolz.achievementsystem.game.Game;
import kolz.achievementsystem.player.Player;

/**
 * This is a demo of the achievement system application.
 *
 */
public class AchievementApp
{
    /*
    *   Load up a new game and fill it with players. Players will get fake stats
    *   and the achievement system will be called.
    */
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Achievement System Demo" );
        Game game = new Game();
        System.out.println( "Loading Players" );
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
        System.out.println( "Players Loaded" );
        System.out.println( "Loading Stats" );
        loadStats(game.getPlayers());
        System.out.println( "Stats Loaded" );
        game.gameOver();
    }

    //Call the stats loader to give players fake stats
    private static void loadStats(List<Player> players) {
        for(Player player : players) {
            try {
                StatsLoader.loadGameStats(player);
                StatsLoader.loadHistoricalStats(player);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AchievementApp.class.getName()).log(Level.SEVERE, "Specified stats file not found", ex);
            }
            
        }
    }

}
