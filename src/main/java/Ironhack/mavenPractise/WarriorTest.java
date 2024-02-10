package Ironhack.mavenPractise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    public void testConvertToElf() {
        Warrior warrior = new Warrior(120, 18, 3, 25);
        Elf elf = warrior.convertToElf();
        assertEquals(120, elf.getHealth());
        assertEquals(18, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(0, elf.getSpeed());
    }
}

