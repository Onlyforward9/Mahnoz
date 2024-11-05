package Codeforces;

import java.util.Scanner;

public class m1475c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
            int[] arr_a = new int[a + 1];
            int[] arr_b = new int[b + 1];
            Integer[] aa = new Integer[k];
            Integer[] bb = new Integer[k];
            for (int i = 0; i < k; i++) arr_a[aa[i] = sc.nextInt()]++;
            for (int i = 0; i < k; i++) arr_b[bb[i] = sc.nextInt()]++;
            long s = 0;
            for (int i = 0; i < k; i++) {
                int p = arr_a[aa[i]] + arr_b[bb[i]] - 2;
                long r = k - i - 1 - p;
                s += r;
                arr_a[aa[i]]--;
                arr_b[bb[i]]--;
            }
            System.out.println(s);
        }
    }
}
