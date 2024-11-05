package Codeforces;

import java.util.Scanner;

public class m1989c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int a = 0, b = 0, c = 0, d = 0;
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                if (p == 1 && arr[i] == 1) c++;
                else if (p == -1 && arr[i] == -1) d++;
                else {
                    if (p > arr[i]) b += p;
                    else a += arr[i];
                }
            }
            int p = Math.abs(a - b);
            if (a < b) a += Math.min(p, c);
            else b += Math.min(p, c);
            c -= Math.min(p, c);
            a += c / 2;
            b += c / 2;
            d -= c % 2;
            int k = Math.min(Math.abs(a - b), d);
            d -= k;
            if (a > b) a -= k;
            else b -= k;
            a -= d / 2;
            b -= d / 2 + d % 2;
            System.out.println(Math.min(a,b));
        }
    }
}
