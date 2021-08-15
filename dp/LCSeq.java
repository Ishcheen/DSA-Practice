import java.util.*;
public class LCSeq{
    public static int count(String x, String y){
        int n=x.length();
        int m=y.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        String X = "ABCBDAB", Y = "BDCABA";
        System.out.print("The length of the LCS is "+ count(X, Y));
    }
}