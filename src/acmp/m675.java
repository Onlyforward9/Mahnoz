package acmp;

import java.util.Scanner;

public class m675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), min = 101;
        while (n-- > 0) {
            String s = sc.next();
            min = Math.min(min, s.length() - s.replace(".", "").length());
        }
        System.out.println(min);
    }
}
