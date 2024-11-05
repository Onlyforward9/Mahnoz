package Codeforces;

import java.util.Scanner;

public class m242b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            num[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, num[i]);
        }
        int l = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min && num[i] == max) {
                l = i + 1;
                break;
            }
        }
        System.out.println(l);
    }
}
