package Codeforces;

import java.util.Scanner;

public class m60a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt(), k = sc.nextInt(), start = 1;
        while (k-- > 0) {
            sc.next();
            sc.next();
            if (sc.next().contains("r")) {
                sc.next();
                start = Math.max(sc.nextInt() + 1, start);
            } else {
                sc.next();
                end = Math.min(sc.nextInt() - 1, end);
            }
        }
        System.out.println(start > end ? -1 : end - start + 1);
    }
}
