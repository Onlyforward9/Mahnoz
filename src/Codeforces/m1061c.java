package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class m1061c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; ++i)
            arr[i] = sc.nextInt();
        sc.close();
        int p = 1000000007;
        int[] memo = new int[n+4];
        for (int s=0; s<=n+3; ++s) memo[s] = 1;
        for (int i=n-1; i>=0; --i)
        {
            ArrayList<Integer> divs = new ArrayList<Integer>();
            for (int s=(int)Math.sqrt(arr[i]); s>=1; --s)
                if (arr[i] % s == 0)
                {
                    divs.add(0, s);
                    if (arr[i] != s*s) divs.add(arr[i]/s);
                }
            for (int s : divs)
            {
                if (s < n+3)
                    memo[s] = (memo[s] + memo[s+1]) % p;
                else break;
            }
        }
        System.out.println(memo[1]-1);
    }
}
