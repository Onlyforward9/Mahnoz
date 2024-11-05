package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1352g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if (n == 2 || n == 3) pw.println(-1);
            else if (n == 4) pw.println("3 1 4 2");
            else {
                int k = 1;
                while (k <= n) {
                    sb.append(k + " ");
                    k += 2;
                }
                int p = n - 3 - (1 - n % 2);
                sb.append(p + " ");
                n = n % 2 == 0 ? n : n - 1;
                while (n > 0) {
                    if (n != p) sb.append(n + " ");
                    n -= 2;
                }
                pw.println(sb);
            }
        }
        pw.close();
    }
}
