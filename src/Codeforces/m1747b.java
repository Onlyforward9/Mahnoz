package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1747b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) pw.println("1\n1 2");
            else if (n == 2) pw.println("1\n2 6");
            else {
                StringBuilder sb = new StringBuilder();
                int l = 0;
                int k = 1;
                int s = 3 * n;
                while (k < s) {
                    sb.append(k + " " + s + "\n");
                    k += 3;
                    s -= 3;
                    l++;
                }
                pw.println(l + "\n" + sb);
            }
        }
        pw.close();
    }
}
//NANNANBABBAB
//2
//        1 12
//        4 9