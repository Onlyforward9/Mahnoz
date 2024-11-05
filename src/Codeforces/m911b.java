package Codeforces;

import java.util.Scanner;

public class m911b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int min = 1;
        for(int i=1;i<n;i++){
            int k=Math.min(a/i,b/(n-i));
            min=Math.max(k,min);
        }
        System.out.println(min);
    }
}
