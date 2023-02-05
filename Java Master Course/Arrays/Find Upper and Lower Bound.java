import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();
int q=s.nextInt();
while(q-->0){
	int target=s.nextInt();
	int ans[]=LowerAndUpperBound(arr,n,target);
	System.out.print(ans[0]+" "+ans[1]);
	System.out.println();
}


    }
	public static int[] LowerAndUpperBound(int arr[], int n, int target){
		int start=0;
		int end=n-1;
		int ans=-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]>target)
			end=mid-1;
			else if(arr[mid]<target)
			start=mid+1;
			else{
				ans=mid;
				break;
			}
		}

int arr1[]=new int[2];

		if(ans==-1){
			arr1[0]=-1;
			arr1[1]=-1;
			return arr1;
		}
// left count
int leftIndex=ans;
int rightIndex=ans;
for(int i=ans-1;i>=0;i--){
	if(i>=0 && arr[ans]==arr[i])
	      leftIndex--;
		  else
		  break;

}

for(int i=ans+1;i<n;i++){
	if( i<n && arr[ans]==arr[i])
	     rightIndex++;
		  else
		  break;

}
arr1[0]=leftIndex;
arr1[1]=rightIndex;
return arr1;

	}
}
