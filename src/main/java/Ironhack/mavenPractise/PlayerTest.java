package Ironhack.mavenPractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testAttackAndHealthManagement() {

        Wizard attacker = new Wizard(100, 20, 3, "Fireball");
        Warrior defender = new Warrior(50, 10, 2, 5);

        // Perform an attack
        attacker.attack(defender);

        // Expectations after the attack
        assertEquals(30, defender.getHealth(), "Defender health should decrease by attacker's strength.");

        // Further attacks to test life decrement
        attacker.attack(defender);
        attacker.attack(defender); // This should decrement defender's life

        // Check health and lives after attacks
        assertTrue(defender.getLives() < 2, "Defender should have lost a life after enough attacks.");
        assertEquals(defender.getInitialHealth(), defender.getHealth(), "Defender's health should be restored to initial value after losing a life.");
    }
}

