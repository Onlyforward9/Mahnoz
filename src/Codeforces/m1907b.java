package Codeforces;

import java.util.Scanner;

public class m1907b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k1 = 0, k2 = 0;
            StringBuilder sb = new StringBuilder();
            String s = scanner.next();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == 'B') k2++;
                else if (s.charAt(i) == 'b') k1++;
                else if (Character.isLowerCase(s.charAt(i))) {
                    if (k1 <= 0) sb.append(s.charAt(i));
                    else k1--;
                } else {
                    if (k2 <= 0) sb.append(s.charAt(i));
                    else k2--;
                }
            }
            System.out.println(sb.reverse());
        }
    }
}
