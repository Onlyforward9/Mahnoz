package acmp;

import java.util.Scanner;

public class m131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max_m = 0;
        int j = -1;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b==1 && a > max_m) {
                max_m = a;
                j = i + 1;
            }
        }
        System.out.println(j);
    }
}
