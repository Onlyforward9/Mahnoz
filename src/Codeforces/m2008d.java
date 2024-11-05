package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m2008d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            String s = sc.next();
            int[] team = new int[n];
            int[] amount = new int[n];
            int te = 1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0' && team[i] == 0) {
                    int k = 0, j = i;
                    do {
                        if (s.charAt(j) == '0') k++;
                        team[j] = te;
                        j = arr[j] - 1;
                    } while (j != i || team[j] != te);
                    amount[te - 1] = k;
                    te++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i : team) {
                sb.append(i == 0 ? "0 " : (amount[i - 1] + " "));
            }
            System.out.println(sb);
        }
    }
}
