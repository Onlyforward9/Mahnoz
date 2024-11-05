package Toi;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean b = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    sb.append(arr[j] + " ");
                    b = true;
                    break;
                }
            }
            if (!b) sb.append("0 ");
        }
        System.out.println(sb);
    }
}
