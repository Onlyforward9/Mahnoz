package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m386a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10001], num = new int[n];
        for (int i = 0; i < n; i++) arr[num[i] = sc.nextInt()] = i + 1;
        Arrays.sort(num);
        System.out.println(arr[num[n - 1]] + " " + num[n - 2]);
    }
}
