package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1095b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int min = Math.min(arr[n - 1] - arr[0], arr[n - 2] - arr[0]);
        System.out.println(Math.min(min, arr[n - 1] - arr[1]));
    }
}
