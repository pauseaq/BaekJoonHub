import java.util.*;

class Main {
	static public void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        b += c;
        if (b >= 60) {
            a += b / 60;
            if (a >= 24) {
                a -= 24;
            }
            b %= 60;
        }
        System.out.printf("%d %d\n", a, b);
    }
}