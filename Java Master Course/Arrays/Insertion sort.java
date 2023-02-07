import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		InsertionSort(arr,n);
		for(int elem:arr)
		System.out.print(elem+" ");

    }

	public static void InsertionSort(int arr[], int n){

int i=0,j=0;
for(i=1;i<n;i++){
	int temp=arr[i];
	for( j=i-1; j>=0 && arr[j]>temp;j--){
		arr[j+1]=arr[j];
	}
	arr[j+1]=temp;
}



	}
	}
