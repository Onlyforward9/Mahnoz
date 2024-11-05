package acmp;

import java.util.Scanner;

public class m35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long p = 19 * m + (n + 239) * (n + 366) / 2;
            System.out.println(p);
        }
    }
}
