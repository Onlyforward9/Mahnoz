package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1521b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                if (b < min) {
                    min = b;
                    index = i + 1;
                }
            }
            pw.println(n - 1);
            for (int i = index + 1; i <= n; i++) pw.println(index + " " + i + " " + min + " " + (min + i - index));
            for (int i = index - 1; i >= 1; i--) pw.println(index + " " + i + " " + min + " " + (min + index - i));
        }
        pw.close();
    }
}
