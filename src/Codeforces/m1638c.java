package Codeforces;

import java.util.Scanner;

public class m1638c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int max = arr[i], l = i;
                for (int j = l + 1; j < max; j++) {max = Math.max(max, arr[j]);i++;}
                k++;
            }
            System.out.println(k);
        }
    }
}
