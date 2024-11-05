package Codeforces;

import java.util.Scanner;

public class m1333b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int k_1 = 0;
            int k_0 = 0;
            int index_0 = -1;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) k_1++;
                else if (a[i] == -1) k_0++;
                else index_0 = i;
            }
        }
    }
}
