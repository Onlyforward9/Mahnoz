package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m716b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        if (s.length() < 26) System.out.println(-1);
        else {
            for (int i = 0; i < s.length() - 25; i++) {
                HashSet<Character> set = new HashSet<>();
                int k = 0, p = 0;
                for (int j = i; j < i + 26; j++) {
                    if (s.charAt(j) == '?') k++;
                    else if (set.contains(s.charAt(j))) break;
                    else set.add(s.charAt(j));
                }
                if (set.size() + k == 26) {
                    for (char ch : set) al = al.replace(ch + "", "");
                    for (int j = i; j < i + 26; j++) {
                        if (s.charAt(j) == '?') sb.append(al.charAt(p++));
                        else sb.append(s.charAt(j));
                    }
                    for (int j = i + 26; i < s.length(); i++) sb.append(s.charAt(j) == '?' ? "A" : s.charAt(j));
                    al = "";
                    break;
                } else sb.append(s.charAt(i) == '?' ? "A" : s.charAt(i));
            }
            if (al.isEmpty()) System.out.println(sb);
            else System.out.println(-1);
        }
    }
}
