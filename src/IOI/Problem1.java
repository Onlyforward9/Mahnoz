package IOI;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        char[][] num = new char[n][m];
        for (int i = 0; i < n; i++) num[i] = sc.next().toCharArray();
        int[][] arr = new int[n][m];
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int l = i, p = j, r = 0;
                do {
                    if (num[l][p] == 'D') l++;
                    else if (num[l][p] == 'U') l--;
                    else if (num[l][p] == 'L') p--;
                    else p++;
                    r++;
                } while (l != i || p != j);
                arr[i][j] = r;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int q = k % arr[i][j], l = i, p = j;
                while (q-- > 0) {
                    if (num[l][p] == 'D') l++;
                    else if (num[l][p] == 'U') l--;
                    else if (num[l][p] == 'L') p--;
                    else p++;
                }
                res[l][p] = (i * m) + j + 1;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++)sb.append(res[i][j]+" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
