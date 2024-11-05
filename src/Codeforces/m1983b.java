package Codeforces;

import java.util.*;

public class m1983b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), l = -1;
            String[][] arr = new String[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < s.length(); j++) arr[i][j] = s.charAt(j) + "";
            }
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < s.length(); j++) {
                    arr[i][j] = ((s.charAt(j) - '0' - Integer.parseInt(arr[i][j]) + 3) % 3) + "";
                }
            }
//            ArrayList<String> set = new ArrayList<>();
//            for (int i = 0; i < n; i++) set.add(Arrays.toString(arr[i]) + "");
//            for (int i = 0; i < n; i++) {
//                String k = Arrays.toString(arr[i]).replace("1", "*").replace("2", "1").replace("*","2");
//                if (set.contains(k))set.remove(k);
//                else {
//                    l=0;
//                    break;
//                }
//            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
