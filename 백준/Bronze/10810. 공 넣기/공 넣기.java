import java.util.*;

class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0, i = 0, j = 0, k = 0;
        int[] printNum = new int[100];
        n = sc.nextInt();
        m = sc.nextInt();
        for (int p = 0; p < m; p++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for (int q = i - 1; q <= j - 1; q++) {
                printNum[q] = k;
            }
        }
        for (int r = 0; r < n; r++) {
            System.out.printf("%d ", printNum[r]);
        }
    }
}
