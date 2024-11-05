package Codeforces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class m1836a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(s);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                if (s != a) list.add(a);
                s=a;
            }
            int k=0,l=1;
            for (int i:list){
                if (i==0){
                    k=1;
                }else {
                    if (i!=k)l=-1;
                    k++;
                }
            }
            System.out.println(l==1?"YES":"NO");
        }
    }
}
