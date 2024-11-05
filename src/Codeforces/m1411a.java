package Codeforces;

import java.util.Scanner;

public class m1411a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int l = n - 1;
            while (l >= 0 && s.charAt(l) == ')') l--;
            System.out.println(l + 1 < n - l - 1 ? "Yes" : "No");
        }
    }
}
//lkjuhi))))
