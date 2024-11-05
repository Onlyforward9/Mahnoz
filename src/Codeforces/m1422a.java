package Codeforces;

import java.util.Scanner;

public class m1422a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t -->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if (a==b && b==c) System.out.println(a);
            else if (a==b || b==c || a==c) System.out.println(a==b?c:b==c?a:b);
            else System.out.println(Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c)));
        }
    }
}
