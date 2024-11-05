package acmp;

import java.util.Scanner;

public class m394 {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.println((a * b / gcd(a, b) / b));
    }
}
