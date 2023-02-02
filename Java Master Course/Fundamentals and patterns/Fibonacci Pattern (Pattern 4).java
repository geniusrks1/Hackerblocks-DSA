import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int count=0;
	int k=n*(n+1)/2;
		
		int dp[]=new int[k+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=k;i++){
			dp[i]=dp[i-1]+dp[i-2];
		}

	for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++){
         System.out.print(dp[count++] +"   ");
		}
		System.out.println();
	}
    }
}
