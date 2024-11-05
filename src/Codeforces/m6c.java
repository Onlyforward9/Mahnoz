package Codeforces;

import java.util.Scanner;

public class m6c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int a = 0, b = n - 1;
        while (a <= b) {
            if (arr[a] <= arr[b]) {
                arr[b] -= arr[a];
                a++;
            } else {
                arr[a] -= arr[b];
                b--;
            }
        }
        System.out.println((a - 1) + " " + (n - b));
    }
}
