package acmp;

import java.util.Scanner;

public class m106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l0=0;
        int l1=0;
        while (n-->0){
            int l=sc.nextInt();
            if (l==0)l0++;
            else l1++;
        }
        System.out.println(Math.min(l0,l1));
    }
}
