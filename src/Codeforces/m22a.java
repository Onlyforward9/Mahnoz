package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m22a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer>set=new TreeSet<>();
        for (int i=0;i<n;i++)set.add(sc.nextInt());
        set.pollFirst();
        System.out.println(set.isEmpty()?"NO":set.first());
    }
}