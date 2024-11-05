package Codeforces;

import java.util.Scanner;

public class m1520e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(),k=0;
            long min = Long.MAX_VALUE,st=0,nd=0;
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    nd+=(i-k);
                    k++;
                }
            }
            int knd=k;
            k=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='.') {
                    st+=k;
                    nd-=knd;
                }else {
                    k++;
                    knd--;
                }
                min=Math.min(min,st+nd);
            }
            System.out.println(min);
        }
    }
}
