package Codeforces;

import java.util.Scanner;

public class m46a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1,p=1;
        for (int i=1;i<n;i++){
            p+=k;
            p%=n;
            p=p==0?n:p;
            System.out.print(p+" ");
            k++;
        }
    }
}
