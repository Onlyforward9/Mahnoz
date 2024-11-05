package acmp;

import java.util.Scanner;

public class m780 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        while (n>0){
            n-=k;
            k++;
        }
        System.out.println(k-1);
    }
}
