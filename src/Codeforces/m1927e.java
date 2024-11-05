package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class m1927e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n];
            int p = 1, s = 0, kl = 0, start = 0, index = 0;
            while (s < n && p <= n) {
                while (index >= s && index < n) {
                    start = index;
                    arr[index] = p;
                    if (s % 2 == 0) index += k;
                    else index -= k;
                    p++;
                    kl++;
                }
                index = start + 1 < n ? start + 1 : start - k + 1;
                s++;
            }
            for (int i : arr) pw.print(i + " ");
            pw.println();
        }
        pw.close();
    }
}
