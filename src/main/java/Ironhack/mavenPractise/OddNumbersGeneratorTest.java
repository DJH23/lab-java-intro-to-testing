package Ironhack.mavenPractise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddNumbersGeneratorTest {

    @Test
    public void testGenerateOddNumbersUpTo5() {
        assertArrayEquals(new int[]{1, 3, 5}, OddNumbersGenerator.generateOddNumbers(5));
    }

    @Test
    public void testGenerateOddNumbersUpTo10() {
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, OddNumbersGenerator.generateOddNumbers(10));
    }

    @Test
    public void testGenerateOddNumbersUpTo1() {
        assertArrayEquals(new int[]{1}, OddNumbersGenerator.generateOddNumbers(1));
    }

    @Test
    public void testGenerateOddNumbersUpToNegative() {
        assertArrayEquals(new int[]{}, OddNumbersGenerator.generateOddNumbers(-5));
    }
}

