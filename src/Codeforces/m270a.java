package Codeforces;

import java.util.Scanner;

public class m270a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {160, 162, 165, 135, 168, 170, 171, 108, 140, 172, 174, 175, 144, 176, 177, 178, 179, 150, 120, 90, 60, 156};
        while (t-- > 0) {
            int n = sc.nextInt();
            String res="NO";
            for (int i:arr)if (i==n)res="YES";
            System.out.println(res);
        }
    }
}
