package Codeforces;

import java.util.Scanner;

public class m34a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = 1000, index = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        arr[n] = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < min) {
                min = Math.abs(arr[i] - arr[i + 1]);
                index = i + 1;
            }
        }
        System.out.println(index == n ? index + " 1":index + " " + (index + 1));
    }
}
