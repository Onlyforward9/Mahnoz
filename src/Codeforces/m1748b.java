package Codeforces;

import java.util.*;

public class m1748b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            char c[]=sc.next().toCharArray();
            long ans=0;
            for(int i=0;i<n;i++) {
                int d=0,f[]=new int[10],mx=0;
                for(int j=i;j<n;j++) {
                    if(f[c[j]-'0']++==0) d++;
                    if(f[c[j]-'0']>10) break;
                    if((mx=Math.max(f[c[j]-'0'],mx))<=d)ans++;
                }
            }
            System.out.println(ans);
        }
    }
}