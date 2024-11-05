package Codeforces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class m1993b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = 0, l = 0;
            long[] arr = new long[n];
            arr[0] = sc.nextLong();
            long max = 0;
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] % 2 != arr[0] % 2) l = -1;
                if (arr[i] % 2 == 1) max = Math.max(max, arr[i]);
            }
            if (arr[0] % 2 == 1) max = Math.max(max, arr[0]);
            Arrays.sort(arr);
            if (l == 0) System.out.println(l);
            else {
                int i = 0;
                while (i < n && arr[i] < max) {
                    if (arr[i] % 2 == 0) {
                        k++;
                        max += arr[i];
                    }
                    i++;
                }
                for (int j = n - 1; j >= i; j--) {
                    if (arr[j] % 2 == 0) {
                        if (arr[j] > max) {
                            k += 2;
                            max += (arr[j] * 2);
                        } else {
                            k += 1;
                            max += arr[j];
                        }
                    }
                }
                System.out.println(k);
            }
        }
    }
}
