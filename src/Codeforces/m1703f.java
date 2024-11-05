package Codeforces;

import java.util.Scanner;

public class m1703f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long count = 0;
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                arr[i] = arr[i - 1];
                if (a < i) {
                    if (a != 0) count += arr[a - 1];
                    arr[i] += 1;
                }
            }
            System.out.println(count);
        }
    }
}
