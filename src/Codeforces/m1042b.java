package Codeforces;

import java.util.Objects;
import java.util.Scanner;

public class m1042b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int AB = 300001;
        int AC = AB;
        int BC = AB;
        int ABC = AB;
        int A = AB;
        int B = AB;
        int C = AB;
        while (t-- > 0) {
            int cost = sc.nextInt();
            String s = sc.next();
            if (Objects.equals(s, "AB") || Objects.equals(s, "BA")) AB = Math.min(AB, cost);
            else if (Objects.equals(s, "BC") || Objects.equals(s, "CB")) BC = Math.min(BC, cost);
            else if (Objects.equals(s, "AC") || Objects.equals(s, "CA")) AC = Math.min(AC, cost);
            else if (Objects.equals(s, "A")) A = Math.min(A, cost);
            else if (Objects.equals(s, "B")) B = Math.min(B, cost);
            else if (Objects.equals(s, "C")) C = Math.min(C, cost);
            else ABC = Math.min(ABC, cost);
        }
        int k_2 = Math.min(AB + C, Math.min(BC + A, AC + B));
        int k = Math.min(ABC, A + B + C);
        int p = Math.min(AB + AC, AB + BC);
        int p1 = Math.min(AC + BC, AC + AB);
        int p2 = Math.min(BC + AC, BC + AB);
        int p_k = Math.min(p, Math.min(p1, p2));
        int l = Math.min(k_2, Math.min(p_k, k));
        System.out.println(l == 300001 ? -1 : l);
    }
}
