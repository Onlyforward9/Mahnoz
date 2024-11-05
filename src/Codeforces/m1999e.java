package Codeforces;

import java.util.Scanner;

public class m1999e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[2 * 100000 + 1];
        arr[1] = 1;
        for (int i = 2; i <= 2 * 100000; i++) {
            int k = 0, p = i;
            while (p != 0) {
                p /= 3;
                k++;
            }
            arr[i] = arr[i - 1] + k;
        }
        while (t-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            if (l == 1 && r == 2) System.out.println(3);
            else {
                System.out.println(arr[r] - arr[l] + ((arr[l] - arr[l - 1]) * 2));
            }
        }
    }
}
