import java.util.*;
public class Main {
    public static void main(String args[]) {

   Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int t=s.nextInt();
Arrays.sort(arr);
        findTriplets(arr, n, t);
}

public static void findTriplets(int arr[], int n, int target){

for(int i=0;i<n;i++){
	int start=i+1;
	int end=n-1;
	while(start<end){
		if(arr[start]+arr[end]+arr[i]==target){
			System.out.println(arr[i] + ", " + arr[start] + " and " + arr[end]);
			start++;
			end--;
		}
		else if(arr[start]+arr[end]+arr[i]>target){
			end--;
		}
		else
		start++;
	}
}

}
}
