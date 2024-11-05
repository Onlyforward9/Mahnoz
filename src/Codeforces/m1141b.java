package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class m1141b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String s = br.readLine();
        s = s.replace(" ", "");
        s += s;
        int k = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') k++;
            else {
                max = Math.max(max, k);
                k = 0;
            }
        }
        System.out.println(Math.max(max, k));
    }
}
