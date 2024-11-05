package Codeforces;

import java.util.Scanner;

public class m1981b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println(15|7);
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        for (int i = 0; i < 10; i++) {
            int pr = arr[0];
            arr[0] = arr[0] | arr[1];
            for (int j = 1; j < arr.length - 1; j++) {
                int o = arr[j];
                arr[j] = pr | arr[j] | arr[j + 1];
                pr = o;
            }
            for (int m : arr) System.out.print(m + " ");
            System.out.println();
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            long p = 1, l = 1, s = 0;
            while (s < m) {
                s += (int) Math.pow(2, l);
                l++;
                p = p * 2 + 1;
            }
            n -= (p - m);
            p = p * 2 + 1;
            l++;
            while (n - (int) Math.pow(2, l) >= 0) {
                n -= (int) Math.pow(2, l);
                l++;
                p = p * 2 + 1;
            }
            System.out.println(p);
        }
    }
}
