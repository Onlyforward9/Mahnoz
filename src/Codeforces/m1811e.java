package Codeforces;

import java.util.Scanner;

public class m1811e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for  (int t=0; t<T; t++) {
            long K = in.nextLong();
            char[] S = Long.toString(K,9).toCharArray();
            for (int i=0; i<S.length; i++) {
                if (S[i] >= '5') {
                    S[i]++;
                }
            }
            System.out.println(new String(S));
        }
    }
}
