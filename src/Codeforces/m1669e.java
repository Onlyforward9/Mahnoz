package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class m1669e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "abcdefghijklmnopqrstuvwxyz";
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[26];
            int[] b = new int[26];
            String[] arr = new String[n];
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String ss = sc.next();
                arr[i] = ss;
                a[s.indexOf(ss.charAt(0) + "")]++;
                b[s.indexOf(ss.charAt(1) + "")]++;
                map.put(ss, map.getOrDefault(ss, 0) + 1);
            }
            long res = 0;
            for (String value : arr) {
                res += a[s.indexOf(value.charAt(0) + "")] - 1;
                res += b[s.indexOf(value.charAt(1) + "")] - 1;
                res -= map.get(value)-1;
                a[s.indexOf(value.charAt(0) + "")]--;
                b[s.indexOf(value.charAt(1) + "")]--;
            }
            System.out.println(res);
        }
    }
}
//jj
//jl
//jm
//kj
//mj
