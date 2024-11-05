package Codeforces;

import java.util.Scanner;

public class m1038a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[26];
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0;i<s.length();i++){
            arr[al.indexOf(s.substring(i,i+1))]++;
        }
        int min=n;
        for (int i=0;i<k;i++)min=Math.min(min,arr[i]);
        System.out.println(min*k);
    }
}
