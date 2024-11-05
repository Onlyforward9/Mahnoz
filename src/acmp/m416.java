package acmp;

import java.util.Scanner;

public class m416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefgh";
        String s = sc.next();
        int j = a.indexOf(s.charAt(0) + "") + 1;
        int i = s.charAt(1) - '0';
        if (j - 2 > 0 && i + 1 < 9) System.out.println(a.charAt(j - 2 - 1) + "" + (i + 1));
        if (j - 1 > 0 && i + 2 < 9) System.out.println(a.charAt(j - 1 - 1) + "" + (i + 2));
        if (j + 1 < 9 && i + 2 < 9) System.out.println(a.charAt(j + 1 - 1) + "" + (i + 2));
        if (j + 2 < 9 && i + 1 < 9) System.out.println(a.charAt(j + 2 - 1) + "" + (i + 1));
        if (j - 2 > 0 && i - 1 > 0) System.out.println(a.charAt(j - 2 - 1) + "" + (i - 1));
        if (j - 1 > 0 && i - 2 > 0) System.out.println(a.charAt(j - 1 - 1) + "" + (i - 2));
        if (j + 1 < 9 && i - 2 > 0) System.out.println(a.charAt(j + 1 - 1) + "" + (i - 2));
        if (j + 2 < 9 && i - 1 > 0) System.out.println(a.charAt(j + 2 - 1) + "" + (i - 1));
    }
}
