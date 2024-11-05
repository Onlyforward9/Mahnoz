package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class m1539C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();
        Long[] arr = new Long[n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        int res = n;
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            long p = arr[i + 1] - arr[i];
            if (p <= x) res--;
            else {
                p = p % x == 0 ? p / x : p / x + 1;
                list.add(p - 1);
            }
        }
        Collections.sort(list);
        for (Long l : list) {
            if (k - l >= 0) {
                k -= l;
                res--;
            } else break;
        }
        System.out.println(res);
    }
}
//