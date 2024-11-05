package Codeforces;

import java.util.Scanner;

public class m1982c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = 0, j = 0, s = 0;
            for (int i = 0; i < n; i++) {
                s += arr[i];
                while (s > r) s -= arr[j++];
                if (s >= l) {
                    k++;
                    s = 0;
                    j = i + 1;
                }
            }
            System.out.println(k);
        }
    }
}
