package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1980b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), f = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int value = arr[f - 1];
            Arrays.sort(arr);
            if (k == n) System.out.println("YES");
            else {
                int i = n - 1;
                while (i >= 0 && arr[i] >= value) i--;
                if (n - i - 1 <= k) System.out.println("YES");
                else {
                    if (arr[n - k] == value) System.out.println("MAYBE");
                    else System.out.println("NO");
                }
            }
        }
    }
}
//5 5 5 4 4 2 2 1 1 0