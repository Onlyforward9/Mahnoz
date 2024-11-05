package Codeforces;

import java.util.Scanner;

public class m118a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String a = "aoyeui", r = s;
        r=r.replace("a","");
        r=r.replace("o","");
        r=r.replace("y","");
        r=r.replace("e","");
        r=r.replace("u","");
        r=r.replace("i","");
        for (int i = 0; i < s.length(); i++) {
            if (!a.contains("" + s.charAt(i)))
             r = r.replace("" + s.charAt(i), "." + s.charAt(i));
            r=r.replace("..",".");
        }
        System.out.println(r);
    }
}
