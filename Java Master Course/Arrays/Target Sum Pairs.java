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
         targetSum(arr, n, t);
}


  

static void targetSum(int arr[], int n, int target){
    int left = 0;
    int right = n - 1;
    while (left < right){
        int sum = arr[left] + arr[right];
        if (sum > target)
        {
            right--;
        }
        else if (sum < target)
        {
            left++;
        }
        else
        {
          System.out.println( arr[left] + " and " + arr[right] );
            left++;
            right--;
        }
    }
}

}
