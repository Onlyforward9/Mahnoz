package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m299a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int i = 0;
        for (; i < n; i++) if (arr[i] % arr[0] != 0) break;
        System.out.println(i == n ? arr[0] : -1);
    }
}
