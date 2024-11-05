package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class m1485b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int k = sc.nextInt();
        int s = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] num = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            num[i + 1] = arr[i + 1] - arr[i] - 1 + arr[i] - s + num[i];
            s = arr[i] + 1;
        }
        num[0] = 0;
        num[num.length - 1] = k - arr[arr.length - 1] + num[num.length - 2];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (l == r) pw.println(k - 1);
            else {
                long ss = num[r - 1] - num[l];
                int aa = arr[l] - arr[l - 1] - 1;
                int bb = arr[r - 1] - arr[r - 2] - 1;
                ss += (k - arr[r - 1]);
                ss += arr[l - 1] - 1;
                pw.println(ss + aa + bb);
            }
        }
        pw.close();
    }
}
//2 6