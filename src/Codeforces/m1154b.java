package Codeforces;

import java.util.Scanner;

public class m1154b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 100000;
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = -200; i <= 200; i++) {
            int k = 100000, j = 0;
            for (; j < n; j++) {
                if (arr[j] != i && k == 100000) k = Math.abs(arr[j] - i);
                if (Math.abs(arr[j] - i) != k && arr[j] != i) break;
            }
            if (k == 100000) {
                System.out.println(0);
                return;
            }
            if (j == n) min = Math.min(min, k);
        }
        System.out.println(min == 100000 ? -1 : min);
    }
}
