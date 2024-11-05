package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1676f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), p = 1, l = 0, max = 0, a = 0, b = 0;
            int[] arr = new int[n + 1];
            arr[0] = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int s = arr[0] - 1;
            for (int i = 1; i <= n; i++) {
                if (arr[i] == arr[i - 1]) p++;
                else {
                    if (s + 1 == arr[i - 1] && p >= k) {
                        l++;
                        s++;
                    } else if (p >= k) {
                        s = arr[i - 1];
                        l = 1;
                    } else l = 0;
                    if (max <= l) {
                        max = l;
                        a = s - l + 1;
                    }
                    p=1;
                }
            }
            System.out.println(max == 0 ? -1 : a + " " + (a + max - 1));
        }
    }
}
//1 0 1 1 1  1 1 0 1 1
