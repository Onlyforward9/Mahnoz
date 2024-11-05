package acmp;

import java.util.Scanner;

public class m907 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt()*2;
        if (c<=a && c<=b) System.out.println("YES");
        else System.out.println("NO");
    }
}
