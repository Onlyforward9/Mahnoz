package acmp;

import java.util.Scanner;

public class m253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), m1 = sc.nextInt();
        int h2 = sc.nextInt(), m2 = sc.nextInt();
        int k = 0;
        if (h1 > h2 || (h1 == h2 && m1 > m2)) {
            for (int i = h1 + 1; i <= 24; i++)
                k += i == 12 || i == 24 ? 13 : i % 12 + 1;
            for (int i = 1; i <= h2; i++)
                k += i == 12 ? 13 : (i % 12) + 1;
        } else {
            for (int i = h1 + 1; i <= h2; i++) k += i == 12 ? 13 : (i % 12) + 1;
        }
        if (m2 >= 30) k++;
        if (m1 > 30) k--;
        System.out.println(k);
    }
}
