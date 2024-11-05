package acmp;

import java.util.Scanner;

public class m482 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        StringBuilder sb=new StringBuilder();
        StringBuilder m=new StringBuilder();
        while (sb.length()<=32768){
            m.append(p);
            sb.append(m);
            p++;
        }
        System.out.println(sb.charAt(n-1));
    }
}
