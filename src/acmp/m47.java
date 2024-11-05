package acmp;

import java.util.Scanner;

public class m47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, p = n;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int sum = sum(i);
                if (max < sum) {
                    p = i;
                    max = sum;
                } else if (max == sum && i < p) p = i;
                sum = sum(n / i);
                if (max < sum) {
                    p = n / i;
                    max = sum;
                } else if (max == sum && n / i < p) p = n / i;
            }
        }
        System.out.println(p);
    }

    public static int sum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
