package this_is_the_coding_test.greedy;

import java.util.Scanner;

public class UntilOne {

    // n -> 1
    // n - 1
    // n / k (if n % k = 0)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int answer = 0;

        while (n != 1) {
            if (n % k == 0) {
                n = n / k;
            } else {
                n = n - 1;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
