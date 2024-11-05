package acmp;

import java.util.Scanner;

public class m61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long sa=0;
        long sb=0;
        for (int i=0;i<4;i++){
            sa+=sc.nextInt();
            sb+=sc.nextInt();
        }
        if (sa>sb) System.out.println(1);
        else if (sb>sa) System.out.println(2);
        else System.out.println("DRAW");
    }
}
