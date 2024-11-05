package acmp;

import java.util.Scanner;

public class m23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int res = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) res += i;
        }
        System.out.println(res);
    }
}
