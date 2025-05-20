package this_is_the_coding_test.implementation;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        // 00:00:00 ~ N:59:59 중에서 3을 포함하는 경우의 수
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String time = i + ":" + j + k;
                    if (time.contains("3")) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
