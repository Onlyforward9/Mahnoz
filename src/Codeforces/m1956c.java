package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1956c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            String m = "";
            for (int i = 1; i <= n; i++) m += (i + " ");
            for (int i = 1; i <= n; i++) a.append("1 " + i + " "+m+"\n");
            for (int i = 1; i < n; i++) b.append("2 " + i + " "+m+"\n");
            b.append("1 1 " + m);
            int k = n * (n + 1) / 2;
            k = k * (n - 1);
            k += (n * n);
            k-=(n-1);
            k += (n - 1) * (n) / 2;
            System.out.println(k + " " + (n*2) + "\n" + a+b);
        }
    }
}
