package acmp;

import java.util.Scanner;

public class m763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 1 && y == 1) System.out.println(0);
        else if (y == x) System.out.println(2);
        else System.out.println(1);
    }
}
