package acmp;

import java.util.Scanner;

public class m539 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a==1?0:a%2==0?a/2:a);
    }
}
