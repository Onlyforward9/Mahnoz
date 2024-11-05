package acmp;

import java.util.Scanner;

public class m692 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==0) System.out.println("NO");
        else {
            while (a%2==0)a/=2;
            System.out.println(a==1?"YES":"NO");
        }
    }
}
