package acmp;

import java.util.Scanner;

public class m409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextInt(), s = 0;
        for (int i = 1; i < n; i++) {
            double d = sc.nextInt();
            double m = (a + d) / 2;
            s += m;
            a = d;
        }
        System.out.println(s / (n - 1));
    }
}
