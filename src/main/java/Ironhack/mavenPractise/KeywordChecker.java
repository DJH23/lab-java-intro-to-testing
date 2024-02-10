package Ironhack.mavenPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeywordChecker {

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile",
            "while"
    ));

    public static boolean containsJavaKeyword(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Check if any word is a Java keyword
        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsJavaKeyword("public class Solution"));
    }
}

