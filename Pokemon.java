/**
 * Pokemon abstract class
 *
 * @author Jian Hua
 * @version 1.0
 */
public abstract class Pokemon implements Comparable<Pokemon> {
    private int level;
    private int currentHealth;
    private int maxHealth;
    private int speed;

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
    public Pokemon(int level, int maxHealth, int speed) {
        if (level > 100 || level < 1) {
            throw new IllegalArgumentException();
        } else {
            this.level = level;
        }
        if (maxHealth > 500 || maxHealth < 1) {
            throw new IllegalArgumentException();
        } else {
            this.maxHealth = maxHealth;
        }
        if (speed > 180 || speed < 1) {
            throw new IllegalArgumentException();
        } else {
            this.speed = speed;
        }
        currentHealth = maxHealth;
    }

    /**
     * attack method
     *
     * @param other
     *            Pokemon
     */
    public abstract void attack(Pokemon other);

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
        if (!(other instanceof Pokemon)) {
            return false;
        }
        Pokemon tem = (Pokemon) other;
        return (tem.currentHealth == currentHealth && tem.maxHealth == maxHealth
                && tem.level == level && tem.speed == speed);
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
     * compareTo method
     *
     * @param other
     *            Pokemon
     * @return integer that states the difference
     */
    public int compareTo(Pokemon other) {
        if (other != null) {
            if (other.level == level) {
                if (other.maxHealth == maxHealth) {
                    if (other.speed == speed) {
                        return 0;
                    } else {
                        return speed - other.speed;
                    }
                } else {
                    return this.maxHealth - maxHealth;
                }
            } else {
                return level - other.level;
            }
        } else {
            return 1;
        }
    }

    /**
     * level getter
     *
     * @return level value.
     */
    public int getLevel() {
        return level;
    }

    /**
     * CurrentHealth getter
     *
     * @return CurrentHealth.
     */
    public int getCurrentHealth() {
        return currentHealth;
    }

    /**
     * MaxHealth getter
     *
     * @return MaxHealth.
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Speed getter
     *
     * @return Speed.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Level setter
     *
     * @param level
     *            input level
     */
    public void setLevel(int level) {
        if (level > 100 || level < 1) {
            throw new IllegalArgumentException();
        } else {
            this.level = level;
        }
    }

    /**
     * currentHeallth setter
     *
     * @param currentHeallth
     *            input currentHeallth
     */
    public void setCurrentHealth(int currentHeallth) {
        if (currentHeallth > maxHealth || currentHeallth < 0) {
            throw new IllegalArgumentException();
        } else {
            this.currentHealth = currentHeallth;
        }
    }

    /**
     * maxHealth setter
     *
     * @param maxHealth
     *            input maxHealth
     */
    public void setMaxHealth(int maxHealth) {
        if (maxHealth > 500 || maxHealth < 1) {
            throw new IllegalArgumentException();
        } else {
            this.maxHealth = maxHealth;
        }
    }

    /**
     * speed setter
     *
     * @param speed
     *            input speed
     */
    public void setSpeed(int speed) {
        if (speed > 180 || speed < 1) {
            throw new IllegalArgumentException();
        } else {
            this.speed = speed;
        }
    }
}
