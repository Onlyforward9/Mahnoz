package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1992b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[k];
            for (int i = 0; i < k; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            long res = 0;
            for (int i = k - 2; i >= 0; i--) res += (arr[i] - 1 + arr[i]);
            System.out.println(res);
        }
    }
}
