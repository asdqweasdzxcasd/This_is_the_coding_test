package this_is_the_coding_test.implementation;

import java.util.Scanner;

public class GameDevelopment {

    // n x m
    // direction [0=북, 1=동, 2=남, 3=서]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 넓이 [n(y축) x m(x축)]
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 위치 (a=x, b=y)
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // 방향 d
        int d = scanner.nextInt();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        // 바다 = 1, 육지 = 0, 가본 육지 = 0이 아닌 다른 수
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] =scanner.nextInt();
            }
        }

        // 캐릭터가 방문한 칸의 수 (시작할 때 밟고 있는 칸이 있으니 1부터 시작한다.)
        int answer = 1;
        // 시작할 때 밟고 있는 칸 (x, y)을 2로 만든다.
        map[y][x] = 2;

        boolean stop = false;
        int turn_count = 0;

        //문제에는 map의 외부에 대한 설명이 없기 때문에, map을 벗어나는 경우는 코드를 작성하지 않았음.
        while (!stop) {
            System.out.println("위치 : (" + x + "," + y + "), 방향 : "+ d);
            if (turn_count == 4) {
                int new_d = (d + 2) % 2;
                int new_x = x + dx[new_d];
                int new_y = y + dy[new_d];
                if (map[new_y][new_x] == 0) {
                    x = new_x;
                    y = new_y;

                    map[new_y][new_x] = 2;
                    answer++;
                } else {
                    stop = true;
                }
                turn_count = 0;
            } else {
                //왼쪽을 본다. 북 -> 서 -> 남 -> 동 = 0 -> 3 -> 2 -> 1 -> 0
                int new_d = (d + 3) % 4;
                //왼쪽 칸 = 0 이라면, 이동한다.
                int new_x = x + dx[new_d];
                int new_y = y + dy[new_d];
                if (map[new_y][new_x] == 0) {
                    x = new_x;
                    y = new_y;
                    d = new_d;

                    map[new_y][new_x] = 2;
                    turn_count = 0;
                    answer++;
                } else {
                    d = new_d;
                    turn_count++;
                }
            }
        }

        System.out.println(answer);
    }
}
