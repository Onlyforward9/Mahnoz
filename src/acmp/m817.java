package acmp;

import java.util.Scanner;

public class m817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), m = sc.nextLong(), d = sc.nextLong(), k = sc.nextLong();
        System.out.println((n + m) * d * k - n * m * d * d);
    }
}
