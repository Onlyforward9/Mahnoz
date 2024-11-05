package Codeforces;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class m1205a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt() * 2, k = n / 2;
        if (k % 2 == 0) pw.println("NO");
        else {
            int[] arr = new int[n];
            int p = 1, s = 0, start = 0, index = 0;
            while (s < n && p <= n) {
                while (index >= s && index < n) {
                    start = index;
                    arr[index] = p;
                    if (s % 2 == 0) index += k;
                    else index -= k;
                    p++;
                }
                index = start + 1 < n ? start + 1 : start - k + 1;
                s++;
            }
            pw.println("YES");
            for (int i : arr) pw.print(i + " ");
        }
        pw.println();
        pw.close();
    }
}