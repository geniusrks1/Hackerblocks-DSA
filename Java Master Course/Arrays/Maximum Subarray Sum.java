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
		
			}

int ans1=MaximumSubarraySum(arr,n);
System.out.println(ans1);
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
}
