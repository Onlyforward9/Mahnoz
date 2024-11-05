package Codeforces;

import java.util.*;

public class m1367c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), res = 0, i = 0;
            char[] arr = sc.next().toCharArray();
            int[] num = new int[n + 1];
            for (int j = 0; j < n; j++) num[j + 1] = num[j] + (arr[j] == '1' ? 1 : 0);
        }
    }

}
