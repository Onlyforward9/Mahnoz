package Codeforces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class m1692f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = {"0 0 3", "0 1 2", "3 3 7", "3 4 6", "3 5 5", "0 4 9", "0 5 8", "0 6 7", "6 8 9", "4 4 5", "7 7 9", "7 8 8", "1 1 1", "2 2 9", "2 3 8", "2 4 7", "2 5 6", "1 3 9", "1 4 8", "1 5 7", "1 6 6", "5 9 9"};
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[10];
            Integer[] num = new Integer[10];
            Arrays.fill(arr,0);
            Arrays.fill(num,0);
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[a % 10]++;
                num[a % 10]++;
            }
            boolean bol = false;
            for (String s : ar) {
                num[Integer.parseInt(s.substring(0, 1))]--;
                num[Integer.parseInt(s.substring(2, 3))]--;
                num[Integer.parseInt(s.substring(4, 5))]--;
                Arrays.sort(num);
                if (num[0] >= 0) {
                    bol = true;
                    break;
                }
                System.arraycopy(arr, 0, num, 0, arr.length);
            }
            System.out.println(bol ? "YES" : "NO");
        }
    }
}
