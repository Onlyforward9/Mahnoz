package Codeforces;

import java.util.Scanner;

public class m1999d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(), a = sc.next();
            char[] arr = a.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = 0, j = 0;
            for (; j < s.length() && i < arr.length; j++) {
                if (s.charAt(j) == arr[i]) {
                    i++;
                    sb.append(arr[i - 1] + "");
                } else if (s.charAt(j) == '?') {
                    i++;
                    sb.append(arr[i - 1] + "");
                } else sb.append(s.charAt(j) + "");
            }
            for (; j < s.length(); j++) sb.append(s.charAt(j) == '?' ? "a" : s.charAt(j) + "");
            System.out.println(i == arr.length ? "YES\n" + sb : "NO");
        }
    }
}
