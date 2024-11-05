package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1758b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) pw.print(1);
            else {
                if (n % 2 == 0) {
                    pw.print("1 3 ");
                    n -= 2;
                }
                for (int i = 0; i < n; i++) pw.print("2 ");
            }
            pw.println();
        }
        pw.close();
    }
}
