package this_is_the_coding_test.implementation;

import java.util.Scanner;

public class UpDownLeftRight {

//    (1,1)
//
//            (N, N)
//    L R U D
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] line = scanner.nextLine().split(" ");
        int[] loc = {1, 1}; // (y, x)
        for (String s : line) {
            if (s.equals("L")) {
                if (loc[1] > 1) {
                    loc[1] = loc[1] - 1;
                }
            } else if (s.equals("R")) {
                if (loc[1] < n) {
                    loc[1] = loc[1] + 1;
                }
            } else if (s.equals("U")) {
                if (loc[0] > 1) {
                    loc[0] = loc[0] - 1;
                }
            } else if (s.equals("D")) {
                if (loc[0] < n) {
                    loc[0] = loc[0] + 1;
                }
            }
        }
        System.out.println(loc[0] + " " + loc[1]);
    }
}
