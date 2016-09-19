/**
 * Ditto class
 *
 * @author Jian Hua
 * @version 1.0
 */
public class Ditto extends Pokemon {
    private Pokemon form;

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
    public Ditto(int level, int maxHealth, int speed) {
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
     * @param form
     *            input form
     */
    public Ditto(int level, int maxHealth, int speed, Pokemon form) {
        super(level, maxHealth, speed);
        if (form instanceof Ditto) {
            throw new IllegalArgumentException();
        } else {
            this.form = form;
        }
    }

    /**
     * attack method
     *
     * @param other
     *            Pokemon
     */
    public void attack(Pokemon other) {
        if (form == null && !(other instanceof Ditto)) {
            other.setCurrentHealth(other.getCurrentHealth() - 0);
        }
        if (form == null && (other instanceof Ditto)) {
            other.setCurrentHealth(other.getCurrentHealth() - 1);
        }
        if (form != null) {
            form.attack(other);
        }
    }

    /**
     * transform method
     *
     * @param other
     *            Pokemon form
     */
    public void transform(Pokemon other) {
        if (form instanceof Ditto) {
            throw new IllegalArgumentException();
        } else {
            this.form = other;
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
        if (!(other instanceof Ditto)) {
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
        String str = "Ditto Level:" + this.getLevel() + " HP:"
                + this.getCurrentHealth() + "/" + this.getMaxHealth()
                + " Speed:" + this.getSpeed();
        return str;
    }
}
