package Codeforces;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class m31b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = sc.next();
        ArrayList<String> list = new ArrayList<>();
        String res = "";
        if (s.contains("@")) {
            while (s.contains("@")) {
                if (!s.endsWith("@") && !s.startsWith("@") && s.charAt(s.indexOf("@") + 1)!='@'){
                    list.add(s.substring(0, s.indexOf("@") + 2));
                    s = s.substring(s.indexOf("@") + 2);
                } else{
                    s = "";
                    res = "No solution";
                }
            }
            if (list.size() > 0 && res == "") {
                list.set(list.size() - 1, list.get(list.size() - 1) + s);
                pw.print(list.get(0));
                for (int i = 1; i < list.size(); i++) pw.print("," + list.get(i));
            } else pw.println(res);
        } else pw.println("No solution");
        pw.close();
    }
}
