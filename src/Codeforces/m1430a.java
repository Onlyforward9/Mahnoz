package Codeforces;

import java.util.Scanner;
public class m1430a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n ==1||n ==2||n == 4)System.out.println(-1);
            else {
                if(n%3==0)System.out.println((n/3)+" 0 0");
                else if(n%3==1)System.out.println((n/3-2)+" 0 1");
                else System.out.println((n/3-1)+" 1 0");
            }
        }
    }
}
//3,5,6,7,8,9,10,11,12,13