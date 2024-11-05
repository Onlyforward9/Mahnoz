package Codeforces;

import java.util.Scanner;

public class m1099b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=(int)Math.sqrt(n);
        System.out.println(s*2+((n-s*s)%s==0?(n-s*s)/s:(n-s*s)/s+1));
    }
}
