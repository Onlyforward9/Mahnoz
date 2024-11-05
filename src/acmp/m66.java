package acmp;

import java.util.Scanner;

public class m66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "qwertyuiopasdfghjklzxcvbnmq";
        int i = res.indexOf(s);
        System.out.println(res.charAt(i + 1));
    }
}
