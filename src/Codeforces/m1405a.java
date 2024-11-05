package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1405a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = n - 1; i >= 0; i--) pw.print(arr[i] + " ");
            pw.println();
        }
        pw.close();
    }
}

