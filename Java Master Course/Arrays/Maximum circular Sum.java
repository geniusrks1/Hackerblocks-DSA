import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
			int n=s.nextInt();
			int arr[]=new int[n];
			int totalSum=0;
			for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
			totalSum+=arr[i];
			}

int ans1=MaximumSubarraySum(arr,n);
int ans2=totalSum-MinimumSubarraySum(arr,n);

System.out.println(Math.max(ans1,ans2));
		}

    }


	public static int MaximumSubarraySum(int arr[], int n){
		int sum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			maxsum=Math.max(sum,maxsum);
			if(sum<0)
			 sum=0;

		}
		return maxsum;
	}

public static int MinimumSubarraySum(int arr[], int n){
		int sum=0;
		int minsum=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			minsum=Math.min(sum,minsum);
			if(sum>0)
			 sum=0;

		}
		return minsum;
	}


}
