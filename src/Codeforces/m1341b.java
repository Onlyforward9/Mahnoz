package Codeforces;

import java.util.Scanner;

public class m1341b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), max = 0, index = 0, p = 0;
            int[] arr = new int[n];
            int[] res = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) res[i-1] = 1;
            }
            for (int i = 0; i < k - 2; i++) if (res[i] == 1) p++;
            for (int i = 1; i <= n - k; i++) {
                if (res[i - 1] == 1) p--;
                if (res[i + k - 1] == 1) p++;
                if (p > max) {
                    max = p;
                    index = i + 1;
                }
            }
            System.out.println((max + 1) + " " + index);
        }
    }
}
