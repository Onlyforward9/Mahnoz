package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1845c {

    public static int sum(String s) {

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i) - '0';
        }
        return res;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String m = sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int[][] find = new int[6][46];
        for (String cur : arr) {
            find[cur.length()][sum(cur)]++;
        }
        System.out.println(Arrays.deepToString(find));
        long res = 0l;
        for (String cur : arr) {
            for (int i = cur.length() % 2; i <= cur.length(); i += 2) {
                int len = cur.length() + i;
                int sumL = sum(cur.substring(0, len / 2));
                int sumR = sum(cur.substring(len / 2));
                if (sumL >= sumR)
                    res += find[i][sumL - sumR];
            }
        }

        for (String cur : arr) {
            for (int i = cur.length() % 2; i < cur.length(); i += 2) {
                int len = cur.length() - i;
                int sumL = sum(cur.substring(len / 2));
                int sumR = sum(cur.substring(0, len / 2));
                if (sumL >= sumR)
                    res += find[i][sumL - sumR];
            }
        }
        System.out.println(res);

    }

}
