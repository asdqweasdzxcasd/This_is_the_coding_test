package this_is_the_coding_test.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {

    // 인접 행렬 : 2차원 배열로 그래프의 연결 관계를 표현하는 방식
    // 노드1과 노드7이 연결된 것을 확인하기 위해서는 graph[1][7] 을 확인한다.
    // 인접 리스트 : 리스트로 그래프의 연결 관계를 표현하는 방식
    // 노드1에 대한 인접 리스트를 앞에서부터 차례대로 확인한다.

    // DFS는 스택 자료구조를 이용한다.
    // 1. 탐색 시작 노드를 스택에 삽입하고 방문 처리한다.
    // 2. 스택의 최상단 노드에 방문하지 않은 인접 노드가 있으면 그 인접 노드를 스택에 넣고 방문 처리한다. 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼낸다.
    // 3. 2번의 과정을 더 이상 수행할 수 없을 때까지 반복한다.
    public static void dfs(List<List<Integer>> graph, int v, boolean[] visited) {
        // 현재 노드를 방문 처리
        visited[v] = true;
        System.out.print(v + " ");

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i : graph.get(v)) {
            if (!visited[i]) {
                dfs(graph, i, visited);
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
        dfs(graph, 1, visited);
    }
}