package Codeforces;

import java.util.Scanner;

public class m147a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "", l = " .,!?";
        for (int i = 0; i < s.length(); i++) {
            if (!l.contains(s.charAt(i) + "")) res += s.charAt(i) + "";
            else if (s.charAt(i) == ' ') {
                if (i != 0 && !res.endsWith(" ")) res += " ";
            } else {
                if (res.endsWith(" ")) res = res.substring(0, res.length() - 1);
                res+=s.charAt(i)+" ";
            }
        }
            System.out.println(res);
    }
}
