package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m233b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Long>set=new HashSet<>();
        for (long i=1;i<=10000;i++){
            int p=0;
            String s= String.valueOf(i);
            for (int j=0;j<s.length();j++)p+=s.charAt(j)-'0';
            System.out.println(p*i+(i*i));
        }
        long n=sc.nextLong();
        long b=(long)Math.sqrt(sc.nextLong()),p=0;
        String a= String.valueOf(b);
        for (int j=0;j<a.length();j++)p+=a.charAt(j)-'0';

    }
}
