package acmp;

import java.util.Scanner;

public class m46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "2.7182818284590452353602875";
        if (n == 0) System.out.println(3);
        else if (n == 25) System.out.println(s);
        else {
            s = "7182818284590452353602875";
            int p = Integer.parseInt(s.substring(n, n + 1));
            int o = Integer.parseInt(s.substring(n - 1, n));
            if (p >= 5) s = s.substring(0, n - 1).concat(String.valueOf(o + 1));
            else s = s.substring(0, n);
            System.out.println("2." + s);
        }
    }
}
