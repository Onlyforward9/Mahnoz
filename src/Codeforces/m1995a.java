package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1995a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[2 * n + 1];
            for (int i = 1; i <= n; i++) for (int j = 1; j <= n; j++) arr[i + j]++;
            Arrays.sort(arr);
            int r = 0, i = 2 * n;
            while (k > 0) {
                k -= arr[i];
                r++;
                i--;
            }
            System.out.println(r);
        }
    }
}
