package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class m1716n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int j = 1;
                for (; j <= n - i; j++) pw.print(j + " ");
                pw.print(n+" ");
                for (; j < n; j++) pw.print(j + " ");
                pw.println();
            }
        }
        pw.close();
    }
}
//5
//1 2 3 4 5
//1 2 3 5 4
//1 2 5 3 4
//1 5 2 3 4
//5 1 2 3 4