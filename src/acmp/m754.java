package acmp;

import java.util.Scanner;

public class m754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=94 && a<=727 && b>=94 && b<=727 && c>=94 && c<=727){
            System.out.println(Math.max(a,Math.max(b,c)));
        }else System.out.println("Error");
    }
}
