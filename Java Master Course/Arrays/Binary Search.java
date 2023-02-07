import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long arr[]= new long[n];
		for(int i=0;i<n;i++)
		arr[i]=s.nextLong();

long m=s.nextLong();

long ans=BinarySearch(arr,n,m);
		System.out.println(ans);

    }

	public static long BinarySearch(long arr[], int n,long target){
	int start=0;
	int end=n-1;
	while(start<=end){
		int mid=(start+end)/2;
		if(arr[mid]>target)
		end=mid-1;
		else if(arr[mid]<target)
		start=mid+1;
		else
		return mid;
	}
	return -1;
	}
}
