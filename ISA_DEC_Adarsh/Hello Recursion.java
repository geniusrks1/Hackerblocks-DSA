import java.util.*;
public class Main {
    public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=s.nextInt();

    int sum=f(arr, 0, n-1);
    System.out.print(sum);

    }

    public static int f(int arr[], int start, int end){
        if(start==end)
        return arr[start];
        else if(start>end)
        return 0;
        else {
            return arr[start]+arr[end]+f(arr,start+1,end-1);
        }
    }
}
