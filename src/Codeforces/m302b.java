package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m302b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), res = 0, sec = 0;
        int[] arr = new int[n], num = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            num[i] = sc.nextInt();
        }
        while (m-- > 0) {
            long p = sc.nextInt();
            while (sec < p) sec += arr[res] * num[res++];
            System.out.println(res);
        }
    }
}
