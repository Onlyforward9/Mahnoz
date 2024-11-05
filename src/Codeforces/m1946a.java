package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1946a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int m = arr[n / 2 + n % 2 - 1];
            int k = 0;
            for (int i = n / 2 + n % 2 - 1; i < arr.length; i++) {
                if (arr[i] == m) {
                    k++;
                } else if (k > 0) break;
            }
            System.out.println(k);
        }
    }
}
