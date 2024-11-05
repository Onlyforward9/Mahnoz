package IOI;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        int[] arr = new int[(int) n];
        int[] num = new int[m + 1];
        int[] res = new int[(int) n];
        int[] p = new int[m + 1];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            num[arr[i]]++;
            res[i] = a;
            p[a]++;
        }
        long s = 0;
        for (int i = 0; i < n; i++) {
            s += num[res[i]] + p[arr[i]];
            p[res[i]]--;
            num[arr[i]]--;
        }
        System.out.println(s);
    }
}
