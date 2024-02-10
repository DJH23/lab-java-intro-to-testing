package Ironhack.mavenPractise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElfTest {

    @Test
    public void testElfProperties() {
        Elf elf = new Elf(90, 15, 2, 30);
        assertEquals(90, elf.getHealth());
        assertEquals(15, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(30, elf.getSpeed());
    }
}

