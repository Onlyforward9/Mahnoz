package acmp;

import java.util.Scanner;

public class m940 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        int n=Integer.parseInt(arr[0]);
        String s=arr[arr.length-1];
        System.out.println(s.substring(0,n-1)+(s.substring(n)));
    }
}
