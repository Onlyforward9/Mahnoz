package Codeforces;

import java.util.Scanner;

public class m1708b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), i = 1;
            StringBuilder sb = new StringBuilder();
            for (; i <= n; i++) {
                if ((r / i) * i >= l) sb.append(((r / i) * i) + " ");
                else break;
            }
            System.out.println(i > n ? "YES\n" + sb : "NO");
        }
    }
}
