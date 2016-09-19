import java.util.Random;

/**
 * Magikarp class
 *
 * @author Jian Hua
 * @version 1.0
 */
public class Magikarp extends Pokemon {
    private double luck;
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
    public Magikarp(int level, int maxHealth, int speed) {
        super(level, maxHealth, speed);

    }

    /**
     * constructor that has 4 args
     *
     * @param level
     *            input level
     * @param maxHealth
     *            input maxHealth
     * @param speed
     *            input speed
     * @param luck
     *            input luck
     */
    public Magikarp(int level, int maxHealth, int speed, double luck) {
        super(level, maxHealth, speed);
        if (luck > 1 && luck < 0) {
            throw new IllegalArgumentException();
        } else {
            this.luck = luck;
        }
    }

    /**
     * attack method
     *
     * @param other
     *            Pokemon
     */
    public void attack(Pokemon other) {
        if (ran.nextDouble() <= luck) {
            other.setCurrentHealth(0);
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
        if (!(other instanceof Magikarp)) {
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
     * luck getter
     *
     * @return luck.
     */
    public double getLukc() {
        return luck;
    }

    /**
     * luck setter
     *
     * @param luck
     *            input luck
     */
    public void setLuck(double luck) {
        if (luck > 1 && luck < 0) {
            throw new IllegalArgumentException();
        } else {
            this.luck = luck;
        }
    }

    /**
     * toString method
     *
     * @return a string that contents object information
     */
    public String toString() {
        String str = "Magikarp Level:" + this.getLevel() + " HP:"
                + this.getCurrentHealth() + "/" + this.getMaxHealth()
                + " Speed:" + this.getSpeed();
        return str;
    }

}
