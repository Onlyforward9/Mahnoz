package acmp;

import java.util.Scanner;

public class m246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a != i + 1) k++;
        }
        if (k == 0) System.out.println(0);
        else System.out.println(k - 1);
    }
}
