package Codeforces;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class m1720b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long[] arr = new Long[n];
            for (int i = 0; i < arr.length; i++) arr[i] = sc.nextLong();
            Arrays.sort(arr);
            System.out.println((arr[n - 1] + arr[n - 2]) - (arr[0] + arr[1]));
        }
    }
}
