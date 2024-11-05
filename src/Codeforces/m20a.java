package Codeforces;

import java.util.Scanner;

public class m20a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.contains("//"))s=s.replace("//","/");
        System.out.println(s.endsWith("/") && s.length()!=1?s.substring(0,s.length()-1):s);
    }
}
