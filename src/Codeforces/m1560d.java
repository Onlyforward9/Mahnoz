package Codeforces;

import java.util.Scanner;

public class m1560d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int min = s.length() + 1;
            int k = 0;
            while (k <= 40) {
                String v = String.valueOf((long) Math.pow(2, k));
                int index = 0;
                for (int i = 0; i < s.length() && index < v.length(); i++) {
                    if (s.charAt(i) == v.charAt(index)) {
                        index++;
                    }
                }
                int p = (s.length() - index) + (v.length() - index);
                min = Math.min(min, p);
                k++;
            }
            System.out.println(min);
        }
    }
}
