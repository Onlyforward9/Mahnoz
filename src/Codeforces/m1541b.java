package Codeforces;

import java.util.Scanner;

public class m1541b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
            long c = 0;
            for (int i = 1; i < n; i++)
                for (int j = a[i] - i; j <= n; j += a[i])
                    if (j >= 1 && ((long) a[i] * a[j] == i + j) && (i < j))
                        c++;
            System.out.println(c);
        }
    }
}
