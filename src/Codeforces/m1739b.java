package Codeforces;

import java.util.Scanner;

public class m1739b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int a = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = a;
            sb.append(a + " ");
            boolean bol = true;
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextInt();
                if (a - arr[i] >= 0 && arr[i] != 0) bol = false;
                sb.append((a + arr[i]) + " ");
                a += arr[i];
            }
            System.out.println(bol ? sb : -1);
        }
    }
}
//1 0 1 1 1 2