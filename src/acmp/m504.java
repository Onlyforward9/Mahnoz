package acmp;

import java.util.Scanner;

public class m504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 3;
        if (n==1) System.out.println("VGC");
        else if (n==2) System.out.println("CVG");
        else System.out.println("GCV");
    }
}
