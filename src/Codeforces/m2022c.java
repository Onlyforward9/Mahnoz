package Codeforces;

import java.util.Scanner;

public class m2022c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), res = 0;
            char[][] arr = new char[2][n];
            arr[0] = sc.next().toCharArray();
            arr[1] = sc.next().toCharArray();
            for (int i = 2; i < n; i++) {
                int a1 = arr[0][i - 2] == 'A' ? 1 : 0, a2 = arr[0][i - 1] == 'A' ? 1 : 0, a3 = arr[0][i] == 'A' ? 1 : 0;
                int b1 = arr[1][i - 2] == 'A' ? 1 : 0, b2 = arr[1][i - 1] == 'A' ? 1 : 0, b3 = arr[1][i] == 'A' ? 1 : 0;
                if (a1 + a2 + a3 + b1 + b2 + b3 >= 4) {
                    arr[0][i - 2] = 'J';
                    arr[0][i - 1] = 'J';
                    arr[0][i] = 'J';
                    arr[1][i - 2] = 'J';
                    arr[1][i - 1] = 'J';
                    arr[1][i] = 'J';
                    res += 2;
                } else if (a1 + a2 + a3 + b1 + b2 + b3 >= 2) {
                    if (a1 + a2 + b1 >= 2) {
                        arr[0][i - 2] = 'J';
                        arr[0][i - 1] = 'J';
                        arr[1][i - 2] = 'J';
                    } else if (b1 + b2 + a1 >= 2) {
                        arr[1][i - 2] = 'J';
                        arr[1][i - 1] = 'J';
                        arr[0][i - 2] = 'J';
                    } else if (a2 + a3 + b3 >= 2) {
                        arr[0][i - 1] = 'J';
                        arr[0][i] = 'J';
                        arr[1][i] = 'J';
                    } else if (b2 + b3 + a3 >= 2) {
                        arr[0][i] = 'J';
                        arr[1][i - 1] = 'J';
                        arr[1][i] = 'J';
                    } else res--;
                    res += 1;
                }
            }
            System.out.println(res);
        }
    }
}
