package Toi;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("E", "A");
        s = s.replace("I", "A");
        s = s.replace("O", "A");
        s = s.replace("U", "A");
        s = s.replace("Y", "A");
        String[] arr = s.split("A");
        int max = 0;
        for (String value : arr) max = Math.max(max, value.length());
        System.out.println(max+1);
    }
}
