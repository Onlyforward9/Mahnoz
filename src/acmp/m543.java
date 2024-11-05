package acmp;

import java.util.Scanner;

public class m543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() - 1, w = sc.nextLong(), d = sc.nextLong(), sum = sc.nextLong();
        long s = (n + 1) * n / 2 * w, p = w - d, l = n + 1;
        for (long i = 1; i <= n; i++) {
            if (s - w * i + p * i == sum) {
                l = i;
                break;
            }
        }
        System.out.println(l);
    }
}
