package Codeforces;

import java.util.Scanner;

public class m1862c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = arr[0] - arr[n-1] + 1;
            for (int i = 0; i < arr.length-1; i++) {
                k=arr[0]+(arr[n-i-1]-i-1);
                if (arr[i] != k) break;
                System.out.println(k);
                arr[0]--;
            }
        }
    }
}
