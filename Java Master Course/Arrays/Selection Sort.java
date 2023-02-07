import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		SelectionSort(arr,n);
		for(int elem:arr)
		System.out.println(elem);

    }

	public static void SelectionSort(int arr[], int n){
		for(int i=0;i<n;i++){
		int	minimumIndex=findminIndex(arr,i,n);
			swap(arr,i,minimumIndex);
		}
	}
	public static int findminIndex(int arr[], int start, int n){
		int min=Integer.MAX_VALUE;
		int minIndex=0;
		for(int i=start; i<n;i++){
			if(arr[i]<min){
             min=arr[i];
			 minIndex=i;
			}
			
		}
		return minIndex;
	}
	public static void swap(int arr[], int i ,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
