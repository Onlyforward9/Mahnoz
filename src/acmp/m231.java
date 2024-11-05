package acmp;

import java.util.Scanner;

public class m231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), num = "0123456789", l = "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (num.contains(s.charAt(i) + "")) l += s.charAt(i) + "";
            else {
                sb.append((s.charAt(i) + "").repeat(Math.max(1, Integer.parseInt(l))));
                l = "0";
            }
        }
        String r = String.valueOf(sb);
        for (int i = 40; i < r.length(); i += 41) {
            r = r.substring(0, i) + "\n" + r.substring(i);
        }
        System.out.println(r.endsWith("\n") ? r.substring(0, s.length() - 1) : r);
    }
}
