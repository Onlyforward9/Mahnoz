package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1733b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int l = (arr[0] + arr[n - 1]) % 2 != 0 ? arr[0] % 2 : arr[n - 1] % 2;
            sb.append("1 ").append(n + "\n");
            for (int i = 1; i < n - 1; i++) {
                if (l == 0) {
                    if (arr[i] % 2 == 0) sb.append((i + 1) + " " + n + "\n");
                    else sb.append("1 " + (i + 1) + "\n");
                } else {
                    if (arr[i] % 2 == 0) sb.append("1 " + (i + 1) + "\n");
                    else sb.append((i + 1) + " " + n + "\n");
                }
            }
            pw.println(n != 1 ? (n - 1) + "\n" + sb.substring(0, sb.length() - 1) : 0);
        }
        pw.close();
    }
}
//2 2 3 0 1 2