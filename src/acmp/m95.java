package acmp;

import java.util.Scanner;

public class m95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 1;
        if (s.length()==1) System.out.println(s+" 0");
        else {
            while (solve(s) >= 10) {
                k++;
                s = solve(s) + "";
            }
            System.out.println(solve(s) + " " + k);
        }
    }

    public static int solve(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) sum += (s.charAt(i) - '0');
        return sum;
    }
}
