package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m337a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int min = arr[n - 1];
        for (int i = 0; i < n - a + 1; i++) min = Math.min(min, arr[i + a - 1] - arr[i]);
        System.out.println(min);
    }
}
