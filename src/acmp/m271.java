package acmp;

import java.util.Scanner;

public class m271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 1, b = 1;
        long k = 2;
        while (a < n) {
            long p = a;
            a += b;
            b = p;
            k++;
        }
        System.out.println(a == n ? 1 + "\n" + k : 0);
    }
}
