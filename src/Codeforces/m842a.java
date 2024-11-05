package Codeforces;

import java.util.Scanner;
public class m842a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt(),r=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),k = sc.nextInt();
        for(;i<=r;i++)if(i%k==0 && i/k>=x && i/k<=y)break;
        System.out.println(i>r?"NO":"YES");
    }
}
