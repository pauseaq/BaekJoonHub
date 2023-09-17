import java.util.*;

class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (max < num) max = num;
            if (min > num) min = num;
        }
        System.out.printf("%d %d\n", min, max);
    }
}
