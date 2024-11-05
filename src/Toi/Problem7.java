package Toi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt(), a = sc.nextInt(), r = 0;
            while (arr[a - 1] != 0) {
                a = arr[a - 1];
                if (a == b) {
                    r = 1;
                    break;
                }
            }
            sb.append(r+"\n");
        }
        System.out.println(sb);
    }
}
