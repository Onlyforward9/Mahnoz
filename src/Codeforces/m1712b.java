package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1712b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = n % 2 == 0 ? 2 : 3;
            pw.print(n % 2 == 0 ? "" : "1 ");
            for (; s <= n; s += 2) {
                pw.print(s + " " + (s - 1)+" ");
            }
            pw.println();
        }
        pw.close();
    }
}
