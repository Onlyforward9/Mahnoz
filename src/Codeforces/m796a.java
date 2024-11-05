package Codeforces;

import java.util.Scanner;

public class m796a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt()-1, k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int min = n;
        for (int i = m - 1; i >= 0; i--) {
            if (arr[i] != 0 && arr[i] <= k) {
                min = m - i;
                break;
            }
        }
        for (int i = m + 1; i < n; i++) {
            if (arr[i] != 0 && arr[i] <= k) {
                if (i - m < min) {
                    min = i - m;
                }
                break;
            }
        }
        System.out.println(min*10);
    }
}
