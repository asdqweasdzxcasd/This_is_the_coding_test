package this_is_the_coding_test.dfs_bfs;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(3);

        System.out.println("result = " + result);
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
