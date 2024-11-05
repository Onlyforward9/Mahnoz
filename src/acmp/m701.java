package acmp;

import java.util.Scanner;

public class m701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.next();
        int r = Integer.parseInt(k, (n % 10) + 2);
        System.out.println(r);
    }
}
