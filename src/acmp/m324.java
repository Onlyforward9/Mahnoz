package acmp;

import java.util.Scanner;

public class m324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0) == s.charAt(3) && s.charAt(1) == s.charAt(2) ? "YES" : "NO");
    }
}
