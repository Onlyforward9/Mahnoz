package Codeforces;

import java.util.Scanner;

public class m66b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = 1;
            for (int j = i - 1; j >= 0 && arr[j] <= arr[j + 1]; j--) p++;
            for (int k = i + 1; k < n && arr[k] <= arr[k - 1]; k++) p++;
            max = Math.max(max, p);
        }
        System.out.println(max);
    }
}
