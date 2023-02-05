import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();// number of stalls
int c=s.nextInt(); // number of cows
int arr[]=new int[n];// position of stalls

for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
Arrays.sort(arr);
int ans=BinarySearch(arr,n,c);
System.out.print(ans);
    }

public static int BinarySearch(int arr[], int n , int c){
	int start=0;
	int end=arr[n-1]-arr[0]; // maximum posible distance
int ans=0;
	while(start<=end){
		int mid=(start+end)/2;
		if(isPossibleToPlace(arr,n,c,mid)){
            ans=mid;
			start=mid+1; // after getting one ans we want maximize it so increasing 
		}
		else{
			end=mid-1;
		}
	}
	return ans;
}

public static boolean isPossibleToPlace(int arr[], int n, int c, int minDistance){
	int count=1;
	int firstcowpos=arr[0];
	for(int i=0;i<n-1;i++){
		if(arr[i+1]-firstcowpos>=minDistance){
			count++;
			firstcowpos=arr[i+1];
			if(count>=c)
			return true;
		}
		

	}
return count>=c;
}

}
