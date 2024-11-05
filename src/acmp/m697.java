package acmp;

import java.util.Scanner;

public class m697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = 2 * (w * h + l * h);
        System.out.println(p % 16 == 0 ? p / 16 : p / 16 + 1);
    }
}
