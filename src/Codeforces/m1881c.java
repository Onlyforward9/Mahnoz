package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1881c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[][] arr = new String[n][n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < s.length(); j++) arr[i][j] = s.substring(j, j + 1);
            }
            long k = 0;
            String al = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n / 2; j++) {
                    if (arr[i][j] != arr[n - i - 1][j]) {
                        k += (Math.abs(al.indexOf(arr[i][j]) - al.indexOf(arr[n - i - 1][j])));
                        if (al.indexOf(arr[i][j]) < al.indexOf(arr[n - i - 1][j])) {
                            arr[i][j] = arr[n - i - 1][j];
                        }
                    }
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
