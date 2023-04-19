
import java.util.*;
public class Main {
     public static List<Integer> countSmaller(int[] nums) {
            
int n=nums.length;
ArrayList<Integer> list =new ArrayList<>();
for(int i:nums)
list.add(i);

Collections.sort(list);

ArrayList<Integer> ans =new ArrayList<>();
        for(int i:nums){
          int x=binaraySearchFirstIndex(list,i);
          ans.add(x);
          list.remove(x);
        }
return ans;
    }



    public static int binaraySearchFirstIndex(ArrayList<Integer> arr,int target){
        int start=0;
        int end=arr.size()-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr.get(mid)==target){
            ans=mid;
            end=mid-1;
            }
            else if(arr.get(mid)<target)
            start=mid+1;
            else
            end=mid-1;
        }
return ans;
    }
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[n];
        for (int i =0;i<n;i++)
        {
            v[i] = sc.nextInt();
        }
        List<Integer> result = countSmaller(v);
        for (int i : result)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
