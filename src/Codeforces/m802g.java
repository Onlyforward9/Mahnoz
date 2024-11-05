package Codeforces;

import java.util.Scanner;

public class m802g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (sb.charAt(sb.length() - 1) != s.charAt(i)) {
                sb.append(s.charAt(i));
            }
        }
        s = String.valueOf(sb);
        if (s.matches(".*h.*e.*i.*d.*i.*")) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
