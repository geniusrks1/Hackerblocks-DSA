import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 arr[i]=s.nextInt();
	 int target=s.nextInt();


	 int min_index= pivotIndex(arr,n);
	int x=-1;
	if(target>=arr[0])
		 x=bsearch(arr,0,min_index-1,target);
	else
	x=bsearch(arr,min_index,n-1, target);

	System.out.print(x);
    }
	


	public static int bsearch(int arr[], int start, int end,int target){
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

	public static int pivotIndex(int arr[], int n){
		int start=0;
		int end=n-1;
		int pi=0;
		while(start<=end){
			int mid=(start+end)/2;
			

			if(arr[mid]>=arr[0]){
				start=mid+1;
			}
			else
			end=mid-1;
			pi=mid;
		}
return pi;



	}
}
