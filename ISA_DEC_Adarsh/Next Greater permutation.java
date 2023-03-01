import java.util.*;
public class Main {


    public static void nextPermutation(int[] nums) {
      int n=nums.length; 
        int j=n-2;

        while(j>=0 && nums[j] >= nums[j+1])
            j--;
        
        if(j<0){
              Arrays.sort(nums);
              return;
        }

            int k=nums.length-1;
            while(k>j && nums[k] <= nums[j])
                k--;
                
            swap(nums,j,k);
        Arrays.sort(nums,j+1,n);
    }




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        nextPermutation(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[], int i, int j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
    }

}
