package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m2005b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
            int[] arr = {sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            int a = sc.nextInt();
            if (a < arr[0]) System.out.println(arr[0] - 1);
            else if (a > arr[1]) System.out.println(n - arr[1]);
            else {
                int min = Math.min(a - arr[0], arr[1] - a) - 1;
                int max = Math.max(a - arr[0], arr[1] - a);
                System.out.println(min + (max - min - 1) / 2 + 1);
            }
        }
    }
}
