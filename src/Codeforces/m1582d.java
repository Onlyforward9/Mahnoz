package Codeforces;

import java.util.Scanner;

public class m1582d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), min = Integer.MAX_VALUE, p = 0, s = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] <= min) {
                    min = arr[i];
                    p = i;
                }
                s += Math.abs(arr[i]);
            }
            s-=Math.abs(min);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i != p) sb.append((arr[i] < 0 ? Math.abs(min) * -1 : Math.abs(min)) + " ");
                else sb.append((min < 0 ? s : s * -1)+" ");
            }
            System.out.println(sb);
        }
    }
}
