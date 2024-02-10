package Ironhack.mavenPractise;

public class Wizard extends Player {

    private String spell;

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), 0);
    }
}


