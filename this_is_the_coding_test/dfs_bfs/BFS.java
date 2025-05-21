package this_is_the_coding_test.dfs_bfs;

import java.util.*;

public class BFS {

    // BFS는 큐 자료구조를 이용한다.
    // 1. 탐색 시작 노드를 큐에 삽입하고 방문 처리한다.
    // 2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리한다.
    // 3. 2번의 과정을 더 이상 수행할 수 없을 때까지 반복한다.
    public static void bfs(List<List<Integer>> graph, int start, boolean[] visited) {
        // 큐(Queue) 구현을 위해 Deque 라이브러리 사용
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int v = queue.poll();
            System.out.print(v + " ");

            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for (int i : graph.get(v)) {
                if (!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 각 노드가 연결된 정보를 리스트 자료형으로 표현(2차원 리스트)
        List<List<Integer>> graph = Arrays.asList(
                new ArrayList<>(),                             // 0번 노드 (사용하지 않음)
                new ArrayList<>(Arrays.asList(2, 3, 8)),       // 1번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(1, 7)),          // 2번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(1, 4, 5)),       // 3번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(3, 5)),          // 4번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(3, 4)),          // 5번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(7)),             // 6번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(2, 6, 8)),       // 7번 노드에 연결된 노드들
                new ArrayList<>(Arrays.asList(1, 7))           // 8번 노드에 연결된 노드들
        );

        // 각 노드가 방문된 정보를 배열로 표현(1차원 배열)
        boolean[] visited = new boolean[9];

        // 정의된 DFS 함수 호출
        bfs(graph, 1, visited);
    }
}