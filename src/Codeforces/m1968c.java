package Codeforces;

import java.util.Scanner;

public class m1968c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) arr[i] = sc.nextInt();
            int k = (int) Math.pow(10, 9);
            sb.append(((int) Math.pow(10, 9)) + " ");
            for (int i = arr.length - 1; i >= 0; i--) {
                k-=arr[i];
                sb= new StringBuilder(k + " " + sb);
            }
            System.out.println(sb);
        }
    }
}
