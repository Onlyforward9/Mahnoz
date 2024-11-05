package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1644b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int k = n;
            int l = n;
            while (l-- > 0) {
                int p = n;
                boolean bol = false;
                while (p >= 1) {
                    if ((n - p + 1) == k && !bol) {
                        sb.append("1 ");
                        bol = true;
                    } else {
                        sb.append(p + " ");
                        p--;
                    }
                }
                k--;
                sb= new StringBuilder(sb.substring(0, sb.length() - 2));
                sb.append("\n");
            }
            pw.println(sb);
        }
        pw.close();
    }
}
