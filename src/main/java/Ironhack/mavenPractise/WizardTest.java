package Ironhack.mavenPractise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {

    @Test
    public void testConvertToElf() {
        Wizard wizard = new Wizard(80, 12, 2, "Lightning Bolt");
        Elf elf = wizard.convertToElf();
        assertEquals(80, elf.getHealth());
        assertEquals(12, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(0, elf.getSpeed());
    }
}

