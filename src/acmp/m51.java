package acmp;

import java.util.Scanner;

public class m51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int o = sc.next().replace(" ", "").length();
        long l = 1;
        while (k > 0) {
            l *= k;
            k -= o;
        }
        System.out.println(l);

    }
}
