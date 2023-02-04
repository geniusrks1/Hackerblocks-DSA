import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int k=s.nextInt(); // number of painters
int n=s.nextInt(); // number of boards
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();


int ans=BinarySearch(arr,n,k);
System.out.print(ans);
    }
	public static int BinarySearch(int arr[], int n, int k){
		int sum=0;
		for(int ele:arr)
		sum+=ele;

		int start=0;
		int end=sum;
		int ans=-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(isPossible(arr,n,k,mid)){
				end=mid-1;
				ans=mid;
			}
			else
			start=mid+1;
		}
		return ans;
	}
	public static boolean isPossible(int arr[], int n, int k ,int maxLimit){
int sum=0;
int count=1;
		for(int i=0;i<n;i++){
			if(sum+arr[i]>maxLimit){
			        sum=arr[i];
					count++;  
					if(arr[i]>maxLimit ||count>k  )
					return false;    	                     
			}
			else
			sum+=arr[i];
		}
		return count<=k;
	}
}
