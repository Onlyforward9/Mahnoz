package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1293a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int k = sc.nextInt();
            int r = s;
            Integer[] arr = new Integer[k];
            for (int i = 0; i < k; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                if (r == arr[i]) r++;
            }
            int p = s;
            for (int i = k - 1; i >= 0; i--) {
                if (arr[i] == p) p--;
            }
            System.out.println(Math.min(r <= n ? r - s : n, p != 0 ? s - p : n));
        }
    }
}
