package Codeforces;

import java.util.Scanner;

public class m157a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int[] a = new int[n], b = new int[n];
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) a[i] += arr[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) b[i] += arr[j][i];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) if (b[j]>a[i])k++;
        System.out.println(k);
    }
}
