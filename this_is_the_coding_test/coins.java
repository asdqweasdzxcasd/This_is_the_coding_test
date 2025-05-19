package this_is_the_coding_test;

public class coins {

    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        int[] coin_types = {500, 100, 50, 10};

        for (int coin : coin_types) {
            count = count + n / coin;
            n = n % coin;
        }

        System.out.println("count = " + count);
    }
}
