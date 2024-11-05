package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1106c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        long s = 0;
        for (int i = 0; i < n / 2; i++)
            s += (long) Math.pow(arr[i] + arr[n - i - 1], 2);
        System.out.println(s);
    }
}
