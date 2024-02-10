package Ironhack.mavenPractise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordCheckerTest {

    @Test
    public void testContainsJavaKeyword() {
        assertTrue(KeywordChecker.containsJavaKeyword("Don't break my heart"));
        assertFalse(KeywordChecker.containsJavaKeyword("I love to breakdance"));
    }
}

