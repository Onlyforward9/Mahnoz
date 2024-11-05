package acmp;

import java.util.Scanner;

public class m233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = -1;
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if (b <= 437 && k==-1) k=i+1;
        }
        System.out.println(k !=-1? "Crash " + k : "No crash");
    }
}
