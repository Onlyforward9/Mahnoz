package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1941d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            Integer[] arr = new Integer[n];
            Integer[] num = new Integer[m];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < m; i++) num[i] = sc.nextInt();
            Arrays.sort(arr);
            Arrays.sort(num);
            int r = 0;
            for (Integer inte : arr) {
                for (int j = 0; j < m; j++) {
                    if (inte + num[j] <= k) r++;
                    else break;
                }
            }
            System.out.println(r);
        }
    }
}
