package acmp;

import java.util.Scanner;

public class m854 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        if (s.equals("heat")) System.out.println(Math.max(n,m));
        if (s.equals("freeze")) System.out.println(Math.min(n,m));
        if (s.equals("fan")) System.out.println(n);
        if (s.equals("auto")) System.out.println(m);
    }
}
