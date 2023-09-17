import java.util.*;

class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0, i = 0, j = 0;
        int[] printNum = new int[100];
        n = sc.nextInt();
        m = sc.nextInt();
        for (int r = 0; r < n; r++) {
            printNum[r] = r + 1;
        }
        for (int p = 0; p < m; p++) {
            int tmp;
            i = sc.nextInt();
            j = sc.nextInt();
            tmp = printNum[i - 1];
            printNum[i - 1] = printNum[j - 1];
            printNum[j - 1] = tmp;
        }
        for (int q = 0; q < n; q++) {
            System.out.printf("%d ", printNum[q]);
        }
    }
}
