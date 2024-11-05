package acmp;

import java.util.Scanner;

public class m941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        long aa = Long.parseLong(a, 3);
        long bb = Long.parseLong(b, 3);
        System.out.println(aa + bb);
    }
}
