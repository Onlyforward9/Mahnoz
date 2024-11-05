package Codeforces;

import java.util.Scanner;

public class m1345b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = 0;
            while (n > 1) {
                int p=2,o=5;
                while (p+o<=n){
                    p+=o;
                    o+=3;
                }
                n-=p;
                k++;
            }
            System.out.println(k);
        }
    }
}
