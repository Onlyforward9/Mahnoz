package Codeforces;

import java.util.Scanner;

public class m1373d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] tok = new int[n + 1];
            int[] juft = new int[n + 1];
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                tok[i + 1] = tok[i];
                juft[i + 1] = juft[i];
                arr[i] = a;
            }
        }
    }
}
