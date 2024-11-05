package acmp;

import java.util.Scanner;

public class m892 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0 || n>12) System.out.println("Error");
        else if (n<=2 || n==12) System.out.println("Winter");
        else if (n<=5) System.out.println("Spring");
        else if (n<=8) System.out.println("Summer");
        else System.out.println("Autumn");
    }
}
