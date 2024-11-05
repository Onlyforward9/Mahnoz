package Codeforces;

import java.util.Scanner;

public class m47b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"", "", ""};
        String r = sc.next() + " " + sc.next() + " " + sc.next();
        if ((r.contains("A>B") || r.contains("B<A")) && (r.contains("A>C") || r.contains("C<A"))) {
            arr[2] = "A";
            if (r.contains("B>C") || r.contains("C<B")) {
                arr[1] = "B";
                arr[0] = "C";
            } else {
                arr[1] = "C";
                arr[0] = "B";
            }
        }
        if ((r.contains("B>A") || r.contains("A<B")) && (r.contains("B>C") || r.contains("C<B"))) {
            arr[2] = "B";
            if (r.contains("A>C") || r.contains("C<A")) {
                arr[1] = "A";
                arr[0] = "C";
            } else {
                arr[1] = "C";
                arr[0] = "A";
            }
        }
        if ((r.contains("C>B") || r.contains("B<C")) && (r.contains("C>A") || r.contains("A<C"))) {
            arr[2] = "C";
            if (r.contains("A>B") || r.contains("B<A")) {
                arr[1] = "A";
                arr[0] = "B";
            } else {
                arr[1] = "B";
                arr[0] = "A";
            }
        }
        System.out.println(arr[0].equals(arr[1]) ?"Impossible":arr[0] + arr[1] + arr[2]);
    }
}
//abc
//acb
//bac
//bca
//cba
//cab
