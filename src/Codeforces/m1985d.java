package Codeforces;

import java.util.Scanner;

public class m1985d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int x = 0, y = 0, e = 0, s = m;
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                if (str.contains("#") && x == 0) x = i + 1;
                if (str.contains("#")) {
                    y = i + 1;
                    s = Math.min(s, str.indexOf("#"));
                    e = Math.max(e, str.lastIndexOf("#") + 1);
                }
            }
            System.out.println((x + (y - x + 2) / 2 - 1) + " " + ((s + (e - s + 2) / 2)));
        }
    }
}
//3 3 - 3 3 = 3 3
//1 5 - 1 5 = 3 3