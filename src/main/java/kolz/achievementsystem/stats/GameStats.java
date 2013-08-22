/*
 * This class represents stats that are tied to individual games. These will be
 * reset after each new game.
 */

package kolz.achievementsystem.stats;


/**
 *
 * @author kolz
 */
public class GameStats{

    private int attacks;
    private int hits;
    private long damage;
    private int kills;
    private int firstHitKill;
    private int assists;
    private int casts;
    private long spellDamage;
    private long timePlayed;

    public GameStats() {
        this.attacks = 0;
        this.hits = 0;
        this.damage = 0;
        this.kills = 0;
        this.firstHitKill = 0;
        this.assists = 0;
        this.casts = 0;
        this.spellDamage = 0;
        this.timePlayed = 0;
    }

    /**
     * @return the attacks
     */
    public int getAttacks() {
        return attacks;
    }

    /**
     * @param attacks the attacks to set
     */
    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }

    /**
     * @return the hits
     */
    public int getHits() {
        return hits;
    }

    /**
     * @param hits the hits to set
     */
    public void setHits(int hits) {
        this.hits = hits;
    }

    /**
     * @return the damage
     */
    public long getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(long damage) {
        this.damage = damage;
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
     * @return the firstHitKill
     */
    public int getFirstHitKill() {
        return firstHitKill;
    }

    /**
     * @param firstHitKill the firstHitKill to set
     */
    public void setFirstHitKill(int firstHitKill) {
        this.firstHitKill = firstHitKill;
    }

    /**
     * @return the assists
     */
    public int getAssists() {
        return assists;
    }

    /**
     * @param assists the assists to set
     */
    public void setAssists(int assists) {
        this.assists = assists;
    }

    /**
     * @return the casts
     */
    public int getCasts() {
        return casts;
    }

    /**
     * @param casts the casts to set
     */
    public void setCasts(int casts) {
        this.casts = casts;
    }

    /**
     * @return the spellDamage
     */
    public long getSpellDamage() {
        return spellDamage;
    }

    /**
     * @param spellDamage the spellDamage to set
     */
    public void setSpellDamage(long spellDamage) {
        this.spellDamage = spellDamage;
    }

    /**
     * @return the timePlayed
     */
    public long getTimePlayed() {
        return timePlayed;
    }

    /**
     * @param timePlayed the timePlayed to set
     */
    public void setTimePlayed(long timePlayed) {
        this.timePlayed = timePlayed;
    }

}
