package Codeforces;

import java.util.Scanner;

public class m1649a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int start = -1;
            int end = -1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0 && start == -1) start = i;
                if (arr[i] == 0) end = i;
            }
            System.out.println(start == -1 ? 0 : end - start + 2);
        }
    }
}
