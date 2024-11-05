package Codeforces;

import java.util.Scanner;
public class m1982a{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int a =sc.nextInt(),b = sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
            System.out.println((y>=x && b<=a)||(x>=y && a<=b)?"NO":"YES");
        }
    }
}
