package this_is_the_coding_test;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {

    //주어진 수들을 M번 더해서 가장 큰 수를 만든다.
    //배열의 특정 인덱스가 K번을 초과할 수는 없다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        int[] sortedArray1 = Arrays.stream(array).sorted().toArray();
        int index = sortedArray1.length - 1;
        int answer = 0;
        for (int i = 1; i <= m; i++) {
            if (i % k == 0) {
                answer = answer + sortedArray1[index-1];
            } else {
                answer = answer + sortedArray1[index];
            }
        }
        System.out.println("answer = " + answer);
    }
}
