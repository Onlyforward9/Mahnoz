package Codeforces;

import java.util.Scanner;

public class m1746b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) if (arr[i] > arr[i + 1]) k++;
            System.out.println(k);
        }
    }
}
