package Codeforces;

import java.util.Scanner;

public class m1793c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), l = 1, r = n, l1 = 0, r1 = n - 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            while (l1 < r1) {
                if (arr[l1] != l && arr[l1] != r && arr[r1] != l && arr[r1] != r) break;
                else {
                    if (arr[l1] == l) {
                        l1++;
                        l++;
                    } else if (arr[l1] == r) {
                        r--;
                        l1++;
                    }
                    if (arr[r1] == l) {
                        r1--;
                        l++;
                    } else if (arr[r1] == r) {
                        r--;
                        r1--;
                    }
                }
            }
            System.out.println(r1 - l1 > 2 ? (l1 + 1) + " " + (r1 + 1) : -1);
        }
    }
}
