package Codeforces;

import java.util.Scanner;

public class m416a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min_x = -2000000000, max_x = 2000000000;
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            int p = sc.nextInt();
            String y = sc.next();
            if (y.equals("Y")) {
                if (a.equals(">=")) min_x = Math.max(min_x, p);
                else if (a.equals(">")) min_x = Math.max(min_x, p + 1);
                else if (a.equals("<=")) max_x = Math.min(max_x, p);
                else max_x = Math.min(max_x, p - 1);
            } else {
                if (a.equals("<")) min_x = Math.max(min_x, p);
                else if (a.equals("<=")) min_x = Math.max(min_x, p + 1);
                else if (a.equals(">")) max_x = Math.min(max_x, p);
                else max_x = Math.min(max_x, p - 1);
            }
        }
        System.out.println(min_x<=max_x?min_x:"Impossible");
    }
}
