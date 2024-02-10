package Ironhack.mavenPractise;

public class OddNumbersGenerator {

    public static int[] generateOddNumbers(int n) {
        if (n < 1) {
            return new int[]{};
        }

        int[] result = new int[(n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i += 2) {
            result[index++] = i;
        }

        return result;
    }
}

