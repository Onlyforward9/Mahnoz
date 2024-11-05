package Codeforces;

import java.util.Scanner;

public class m961b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), res = 0, max = 0;
        int[] arr = new int[n], num = new int[n + 1];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        num[0] = 0;
        for (int i = 1; i <= n; i++) {
            num[i] = num[i - 1];
            if (sc.nextInt() == 0) num[i] += arr[i - 1];
            else res += arr[i - 1];
        }
        for (int j = 1; j <= n - k + 1; j++)
            max = Math.max(max, num[j + k - 1] - num[j - 1]);
        System.out.println(res + max);
    }
}
