package Codeforces;

import java.util.Scanner;

public class m1167a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (s.contains("8") && n - s.indexOf("8") >= 11) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
