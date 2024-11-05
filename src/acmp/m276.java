package acmp;

import java.util.Scanner;

public class m276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = n % m;
        int pp = n / m;
        StringBuilder sb=new StringBuilder();
        sb.append((pp + " ").repeat(Math.max(0, m - p)));
        sb.append(((pp + 1) + " ").repeat(Math.max(0, p)));
        System.out.println(sb);
    }
}
