package Codeforces;

import java.util.Scanner;

public class m1945e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            int index = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                if (b == x) index = i + 1;
                arr[i] = b;
            }
            int l = 0, r = n + 1;
            while (r - l > 1) {
                int m = ((r + l) / 2)-1;
                if (arr[m] <= x) l = m;
                else r = m;
            }
            if (l == index) System.out.println(0);
            else System.out.println(index + " " + l);
        }
    }
}
