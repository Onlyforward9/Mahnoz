package acmp;

import java.util.Scanner;

public class m328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = (n + 1) * n / 2, sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * (n - i + 1) + s;
            s -= i;
        }
        System.out.println(sum);
    }
}
