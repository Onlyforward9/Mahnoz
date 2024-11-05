package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1974b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = "";
            for (int i = 0; i < s.length(); i++) if (!r.contains(s.charAt(i)+"")) r += s.charAt(i) + "";
            char[] arr = r.toCharArray();
            char[] num = new char[26];
            Arrays.sort(arr);
            String l = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < arr.length; i++) num[l.indexOf(arr[i] + "")] = arr[arr.length - i - 1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) sb.append(num[l.indexOf(s.charAt(i) + "")]);
            System.out.println(sb);
        }
    }
}
