package Codeforces;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class m1930b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String koz = sc.next();
            ArrayList<String> C = new ArrayList<>();
            ArrayList<String> D = new ArrayList<>();
            ArrayList<String> H = new ArrayList<>();
            ArrayList<String> S = new ArrayList<>();
            for (int i = 0; i < 2 * n; i++) {
                String str = sc.next();
                if (str.charAt(1) == 'C') C.add(str);
                else if (str.charAt(1) == 'S') S.add(str);
                else if (str.charAt(1) == 'D') D.add(str);
                else H.add(str);
            }
            Collections.sort(C);
            Collections.sort(H);
            Collections.sort(S);
            Collections.sort(D);

            StringBuilder sb = new StringBuilder();
            int p = 1;
            if (Objects.equals(koz, "C")) {
                sb.append(ss(D));
                sb.append(ss(S));
                sb.append(ss(H));
                if (D.size() % 2 == 1) {
                    if (C.isEmpty()) p = -1;
                    else {
                        sb.append(D.get(D.size() - 1) + " " + C.get(0) + "\n");
                        C.remove(0);
                    }
                }
                if (S.size() % 2 == 1) {
                    if (C.isEmpty()) p = -1;
                    else {
                        sb.append(S.get(S.size() - 1) + " " + C.get(0) + "\n");
                        C.remove(0);
                    }
                }
                if (H.size() % 2 == 1) {
                    if (C.isEmpty()) p = -1;
                    else {
                        sb.append(H.get(H.size() - 1) + " " + C.get(0) + "\n");
                        C.remove(0);
                    }
                }
            }
            if (Objects.equals(koz, "H")) {
                sb.append(ss(C));
                sb.append(ss(S));
                sb.append(ss(D));
                if (C.size() % 2 == 1) {
                    if (H.isEmpty()) p = -1;
                    else {
                        sb.append(C.get(C.size() - 1) + " " + H.get(0) + "\n");
                        H.remove(0);
                    }
                }
                if (S.size() % 2 == 1) {
                    if (H.isEmpty()) p = -1;
                    else {
                        sb.append(S.get(S.size() - 1) + " " + H.get(0) + "\n");
                        H.remove(0);
                    }
                }
                if (D.size() % 2 == 1) {
                    if (H.isEmpty()) p = -1;
                    else {
                        sb.append(D.get(D.size() - 1) + " " + H.get(0) + "\n");
                        H.remove(0);
                    }
                }
            }
            if (Objects.equals(koz, "D")) {
                sb.append(ss(C));
                sb.append(ss(S));
                sb.append(ss(H));
                if (C.size() % 2 == 1) {
                    if (D.isEmpty()) p = -1;
                    else {
                        sb.append(C.get(C.size() - 1) + " " + D.get(0) + "\n");
                        D.remove(0);
                    }
                }
                if (S.size() % 2 == 1) {
                    if (D.isEmpty()) p = -1;
                    else {
                        sb.append(S.get(S.size() - 1) + " " + D.get(0) + "\n");
                        D.remove(0);
                    }
                }
                if (H.size() % 2 == 1) {
                    if (D.isEmpty()) p = -1;
                    else {
                        sb.append(H.get(H.size() - 1) + " " + D.get(0) + "\n");
                        D.remove(0);
                    }
                }
            }
            if (Objects.equals(koz, "S")) {
                sb.append(ss(C));
                sb.append(ss(H));
                sb.append(ss(D));
                if (C.size() % 2 == 1) {
                    if (S.isEmpty()) p = -1;
                    else {
                        sb.append(C.get(C.size() - 1) + " " + S.get(0) + "\n");
                        S.remove(0);
                    }
                }
                if (H.size() % 2 == 1) {
                    if (S.isEmpty()) p = -1;
                    else {
                        sb.append(H.get(H.size() - 1) + " " + S.get(0) + "\n");
                        S.remove(0);
                    }
                }
                if (D.size() % 2 == 1) {
                    if (S.isEmpty()) p = -1;
                    else {
                        sb.append(D.get(D.size() - 1) + " " + S.get(0) + "\n");
                        S.remove(0);
                    }
                }
            }
            if (p == -1) pw.println("IMPOSSIBLE");
            else {
                switch (koz) {
                    case "C":
                        sb.append(ss(C) + "\n");
                        if (C.size() % 2 != 0) p = -1;
                        break;
                    case "D":
                        sb.append(ss(D) + "\n");
                        if (D.size() % 2 != 0) p = -1;
                        break;
                    case "S":
                        sb.append(ss(S) + "\n");
                        if (S.size() % 2 != 0) p = -1;
                        break;
                    default:
                        sb.append(ss(H) + "\n");
                        if (H.size() % 2 != 0) p = -1;
                        break;
                }
                pw.println(p == -1 ? "IMPOSSIBLE" : sb.substring(0, sb.length() - 2));
            }
        }
        pw.close();
    }

    public static StringBuilder ss(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i+=2) {
            sb.append(list.get(i) + " " + list.get(i + 1) + "\n");
        }
        return sb;
    }
}
