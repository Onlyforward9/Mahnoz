package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1613b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int index = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[i] = a;
                if (a < min) {
                    min = a;
                    index = i + 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            int k = n / 2;
            for (int i = 1; i <= n; i++) {
                if (i != index) {
                    if (k > 0) {
                        sb.append(arr[i]).append(" ").append(min).append("\n");
                        k--;
                    } else break;
                }
            }
            pw.println(sb.substring(0, sb.length() - 1));
        }
        pw.close();
    }
}
