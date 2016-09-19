import java.util.Random;

/**
 * Pikachu class
 *
 * @author Jian Hua
 * @version 1.0
 */
public class Pikachu extends Pokemon {
    private Random ran = new Random();

    /**
     * constructor that has 3 args
     *
     * @param level
     *            input level
     * @param maxHealth
     *            input maxHealth
     * @param speed
     *            input speed
     */
    public Pikachu(int level, int maxHealth, int speed) {
        super(level, maxHealth, speed);
    }

    /**
     * attack method
     *
     * @param other
     *            Pokemon
     */
    public void attack(Pokemon other) {
        int healthLoss = ran.nextInt(this.getLevel());
        if (other.getCurrentHealth() > healthLoss) {
            this.setCurrentHealth(this.getCurrentHealth() - healthLoss);
        } else {
            this.setCurrentHealth(0);
        }
    }

    /**
     * equals method
     *
     * @param other
     *            object
     * @return boolean value
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof Pikachu)) {
            return false;
        }
        return super.equals(other);
    }
    /**
     * hashCode method
     *
     * @return 1
     */
    public int hashCode() {
        return 1;
    }

    /**
     * toString method
     *
     * @return a string that contents object information
     */
    public String toString() {
        String str = "Pikachu Level:" + this.getLevel() + " HP:"
                + this.getCurrentHealth() + "/" + this.getMaxHealth()
                + " Speed:" + this.getSpeed();
        return str;
    }

}
