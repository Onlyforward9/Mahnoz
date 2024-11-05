package ITMO;

import java.util.Scanner;

public class Z_function4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String m = sc.next();
            int[] arr = new int[s.length()];
            for (int i = 0; i <= s.length() - m.length(); i++) {
                if (m.equals(s.substring(i, i + m.length()))) arr[i + m.length() - 1] = 1;
            }
            long k = 0, res = 0, p = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    if (p == -1) k = i - m.length() + 2;
                    else k += i - p;
                    p = i;
                }
                res += k;
            }
            System.out.println((long) (s.length() + 1) * s.length() / 2 - res);
        }
    }
}
