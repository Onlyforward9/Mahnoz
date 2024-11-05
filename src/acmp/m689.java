package acmp;

import java.util.HashSet;
import java.util.Scanner;

public class m689 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int min = 10000, l = 0;
            String res = "";
            for (int i = 2; i <= 36; i++) {
                String s = Long.toString(n, i);
                HashSet<String> set = new HashSet<>();
                for (int j = 0; j < s.length(); j++) set.add(s.charAt(j) + "");
                if (set.size() + s.length() < min) {
                    min = set.size() + s.length();
                    res = s;
                    l = i;
                }
            }
            System.out.println(l + " " + res.toUpperCase());
        }
    }
}