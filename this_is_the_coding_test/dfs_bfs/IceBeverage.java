package this_is_the_coding_test.dfs_bfs;

import java.util.Scanner;

public class IceBeverage {

    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && graph[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }

    // 얼음틀 = n * m

    public static void main(String[] args) {
        int answer = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n][m];
        visited = new boolean[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && graph[i][j] == 0) {
                    dfs(i, j);
                    answer++;
                }
            }
        }

        System.out.println("answer = " + answer);
    }
}
