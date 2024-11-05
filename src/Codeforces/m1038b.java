package Codeforces;

import java.util.Scanner;

public class m1038b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        long s = (long) n * (n + 1) / 2;
        int i = 2;
        for (; (long) i * i <= s; i++) if (s % i == 0) break;
        if (s % i != 0) System.out.println("No");
        else {
            for (int j = 1; j <= n; j++) if (j != i) sb.append(j + " ");
            System.out.println("Yes");
            System.out.println("1 " + i);
            System.out.println((n - 1) + " " + sb);
        }
    }
}
