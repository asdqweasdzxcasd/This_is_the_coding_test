package this_is_the_coding_test.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCardGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[][] values = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                values[i][j] = Integer.parseInt(line[j]);
            }
        }
        scanner.close();

        int[] minimums = new int[n];
        for (int i = 0; i < n; i++) {
            int minimum = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                minimum = Math.min(minimum, values[i][j]);
            }
            minimums[i] = minimum;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, minimums[i]);
        }
        System.out.println(max);
    }
}
