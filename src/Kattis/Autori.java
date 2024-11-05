package Kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[]arr=s.split("-");
        StringBuilder sb=new StringBuilder();
        for (String value : arr) {
            sb.append(value.charAt(0));
        }
        System.out.println(sb);
    }
}
