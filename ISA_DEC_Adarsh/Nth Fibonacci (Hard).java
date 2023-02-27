import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   
	   int dp[]=new int[n+1];
	   int ans=fib(n-1,dp);
	   System.out.print(ans);
    }
	public static int fib(int n ,int dp[]){
		if(n==0|| n==1)
		return 1;
		dp[1]=1;
if(dp[n]!=0)
return dp[n];

return dp[n]=fib(n-1,dp)+fib(n-2,dp);

	}
}
