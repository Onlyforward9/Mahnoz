package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m2032b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            if (n == 1) pw.println("1\n1");
            else if (k == 1 || k == n) pw.println(-1);
            else {
                if (k % 2 == 0) {
                    if (k + 1 != n) pw.println("3\n" + "1 " + k + " " + (k + 1));
                    else pw.println("3\n" + "1 " + k + " " + n);
                } else {
                    if (k + 2 != n) pw.println("3\n1 " + (k - 1) + " " + (k + 2));
                    else pw.println("3\n1 " + (k - 1) + " " + n);
                }
            }
        }
        pw.close();
    }
}
