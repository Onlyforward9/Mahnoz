package Codeforces;

import java.util.Scanner;

public class m1802b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int k1=0,k=0,s=0;
            for(int i=0;i<n;i++) {
                int a=sc.nextInt();
                if(a==1) {
                    k++;
                    s++;
                }else k=s>0?s/2+1:0;
                k1=Math.max(k,k1);
            }
            System.out.println(k1);
        }
    }
}
