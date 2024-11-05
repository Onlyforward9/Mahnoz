package Codeforces;


import java.util.Scanner;

public class m166e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = 1, b = 0,m=1000000007;
        for (int i=1;i<n;i++){
            a*=1.5;
            a%=m;
            a*=2;
            a%=m;
            b=a-b;
            b%=m;
        }
        System.out.println((long) b);
    }
}
//**.*