package ITMO;

import java.util.HashSet;
import java.util.Scanner;

public class Z_function6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 26; i++) set.add((int) Math.pow(2, i));
        String al = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder aa = new StringBuilder();
        aa.append("a");
        for (int i = 1; i < 26; i++) aa.append(("" + al.charAt(i) + "") + aa);
        String arr = String.valueOf(aa);
        int t = sc.nextInt();
        while (t-- > 0) {
            int o = sc.nextInt();
            int p = sc.nextInt();
            if (p == 0) System.out.println(0);
            else if (set.contains(p)) System.out.println(p - 1);
            else if (p % 2 == 1) System.out.println(0);
            else {
                String s = arr.substring(0, (int) (Math.pow(2, o) - 1));
                String a = s.substring(p);
                s = s.substring(0, a.length());
                int l = s.length();
                int start = 0, end = a.length();
                if (a.equals(s)) System.out.println(a.length());
                else {
                    int i = 30;
                    while (i-- > 0) {
                        if (end != a.length() && s.substring(0, end).equals(a.substring(0, end)) && s.charAt(end) != a.charAt(end))
                            break;
                        else if (s.substring(0, end).equals(a.substring(0, end))) {
                            start = end;
                            end += (l - end + 1) / 2;
                        } else {
                            l = end;
                            end -= (end - start + 1) / 2;
                        }
                    }
                    System.out.println(end);
                }
            }
        }
    }
}
