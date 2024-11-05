package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1945d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] res = new long[n + 1];
            Long[] num = new Long[n];
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextLong();
            }
            for (int i = n - 1; i >= 0; i--) {
                res[i] = res[i + 1] + Math.min(arr[i], num[i]);
            }
            long min = Long.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                min = Math.min(min, res[i]-Math.min(num[i],arr[i])+arr[i]);
            }
            System.out.println(min);
        }
    }
}
