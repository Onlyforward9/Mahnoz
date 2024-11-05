package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class m349b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(), min = Integer.MAX_VALUE, l = 0, u = 0;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= min && arr[i] <= v) {
                min = arr[i];
                l = i + 1;
            }
        }
        if (min == Integer.MAX_VALUE) System.out.println(-1);
        else {
            int k = (v / min), o = v - (k * min) + arr[l - 1], mx = 0;
            StringBuilder sb = new StringBuilder();
            while (o != arr[l - 1]) {
                for (int i = 0; i < 9; i++) if (arr[i] <= o) mx = i + 1;
                if (mx == l) o = arr[l - 1];
                else {
                    sb.append(mx);
                    o = o - arr[mx - 1] + arr[l - 1];
                    u++;
                }
            }
            for (int i = 0; i < k - u; i++) sb.append(l);
            System.out.println(sb.length() == 0 ? "-1" : sb);
        }
    }
}
