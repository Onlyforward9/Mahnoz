package Codeforces;

import java.util.Scanner;

public class m1979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            for (int i = 1; i < 100; i++){
                System.out.print((x^i)+" ");
            }
            System.out.println();
            for (int i = 1; i < 100; i++){
                System.out.print((y^i)+" ");
            }
            System.out.println();
        }
    }
}
