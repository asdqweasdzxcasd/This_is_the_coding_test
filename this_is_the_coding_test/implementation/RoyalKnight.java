package this_is_the_coding_test.implementation;

import java.util.Scanner;

public class RoyalKnight {

    // 8 x 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = scanner.next();
        int xLoc = location.charAt(0) - 96;
        int yLoc = Character.getNumericValue(location.charAt(1));
        int answer = 0;
//        System.out.println("xLoc = " + xLoc);
//        System.out.println("yLoc = " + yLoc);
        int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
        int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
        for (int i = 0; i < 8; i++) {
            int x = xLoc + dx[i];
            int y = yLoc + dy[i];
            if (1<= x && x <= 8 && 1 <= y && y <= 8) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
