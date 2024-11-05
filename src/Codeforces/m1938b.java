package Codeforces;

import java.util.Scanner;

public class m1938b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long sum1 = 0, sum0 = 0;
        boolean b1 = false, b0 = false;
        Integer[] arr = new Integer[n];
        Integer[] num = new Integer[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int l = s.length();
            int k_1 = s.length() - s.replace("1", "").length();
            if (k_1 > l - k_1) b1 = true;
            else b0 = true;
            sum += Math.min(k_1, l - k_1);
            arr[i] = k_1;
            num[i] = l - k_1;
            if (Math.min(k_1, l - k_1) != 0) {
                sum1 += k_1;
                sum0 += l - k_1;
            }
        }
        long min1 = sum1 + sum0;
        long min0 = min1;
        if (b1 && b0) System.out.println(sum);
        else {
            for (int i = 0; i < n; i++) {
                if (b1) {
                    min0 = Math.min(sum0 - num[i] + arr[i], min0);
                } else {
                    min1 = Math.min(min1, sum1 - arr[i] + num[i]);
                }
            }
            if (b0) System.out.println(min1);
            else System.out.println(min0);
        }
    }
}
