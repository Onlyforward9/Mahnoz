package acmp;

import java.util.Scanner;

public class m383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (sum(i) % (String.valueOf(i).length()) == 0) {
                k++;
                if (k == n) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static int sum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
