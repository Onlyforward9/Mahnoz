package acmp;

import java.util.Scanner;

public class m785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        for (long i = a; i <= b; i++) {
            String s = String.valueOf(i * i);
            if (s.endsWith(i + "")) System.out.print(i + " ");
        }
    }
}
