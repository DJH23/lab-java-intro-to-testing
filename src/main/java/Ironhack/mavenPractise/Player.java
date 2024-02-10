package Ironhack.mavenPractise;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int initialHealth; // To restore health when decrementLive() is called

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.initialHealth = health; // Initialize with the starting health value
    }

    // Getters
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    public int getInitialHealth() {
        return initialHealth;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    // Method to decrement lives
    // Method to decrement lives and manage health
    public void decrementLive() {
        if (lives > 0) {
            this.lives--;
            this.health = initialHealth;
            if (this.lives <= 0) {
                System.out.println("This character is now dead.");
            }
        } else {
            System.out.println("This character is dead. No lives left.");
        }
    }

    // Method for attacking another player and managing health
    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
        playerToAttack.checkHealth();
    }

    // Check health and decrement life if necessary
    public void checkHealth() {
        if (this.health <= 0 && this.lives > 0) {
            decrementLive();
        } else if (this.lives <= 0) {
            System.out.println("Cannot decrement lives. This character is dead.");
        }
    }
}

