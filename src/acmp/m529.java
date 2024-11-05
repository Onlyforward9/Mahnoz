package acmp;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class m529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double a = x1 - x2;
        double b = y1 - y2;
        double p = Math.sqrt(a * a) + (b * b);
        MathContext m = new MathContext(12);
        BigDecimal b2 = BigDecimal.valueOf(p).round(m);
        System.out.println(b2);
    }
}
