package Codeforces;

import java.util.Scanner;

public class m158a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt() - 1, res = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) if (arr[i] >= arr[k] && arr[i] > 0) res++;
        System.out.println(res);
    }
}
