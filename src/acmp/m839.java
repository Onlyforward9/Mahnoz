package acmp;

import java.util.Scanner;

public class m839 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals("0")) res++;
        }
        System.out.println(res==0 ? "YES":"NO");
    }
}
