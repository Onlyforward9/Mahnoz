package Codeforces;

import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class m1930a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder s = new StringBuilder();
            int p = 1;
            for (int i = n; i > (n / 2); i--) {
                s.append(i != p ? i + " " + p + " " : p);
                p++;
            }
            pw.println(s);
        }
        pw.close();
    }
}
