package Codeforces;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class m385c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 10000001;
        int[] isp = new int[p], arr = new int[p];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i < p; i++) {
            BigInteger a = BigInteger.valueOf(i);
            if (a.isProbablePrime((int) Math.log(i))) {
            }
        }
    }
}