package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1943b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            Arrays.fill(arr, 0);
            int min = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[a]++;
                min = Math.max(min, a) + 1;
            }
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] <= i) min = i;
            }
            System.out.println(min);
        }
    }
}
