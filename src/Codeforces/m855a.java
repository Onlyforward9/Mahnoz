package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m855a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            String a=sc.next();
            if (set.contains(a))sb.append("YES\n");
            else sb.append("NO\n");
            set.add(a);
        }
        System.out.println(sb);
    }
}
