import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t-->0){
	int n=s.nextInt(); // number of books
	int m=s.nextInt(); // number of students
	int arr[]=new int [n]; // number of pages in each book

for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
int ans=BinarySearch(arr,n,m);
System.out.println(ans);

}
    }

	public static int BinarySearch(int arr[], int n , int m){
		int sum=0;
		for(int i=0;i<n;i++)
		sum+=arr[i];
	
	int start=arr[0];
	int end=sum;
int min=Integer.MAX_VALUE;

	while(start<=end){
		int mid =(start+end)/2;

if(IsPosToAllocate(arr,n,m,mid)){
min=mid;
end=mid-1; // we decreasing our ans towrds start to get minimum ans
}
else
start=mid+1; // if not possible then we will increase our search space

	}
	return min;
}


		public static boolean IsPosToAllocate(int arr[],int n,int m ,int maxPagesfor1Student){
			int allcotedStudent=1;
			int pages=0;

			for(int i=0;i<n;i++){
             if(arr[i]>maxPagesfor1Student)
			 return false;
              
			 if(pages+arr[i]<=maxPagesfor1Student){
				  pages+=arr[i];
			 }
			 else{
			  allcotedStudent++;
			  pages=arr[i];
			 }
			 
			 
		}

         return allcotedStudent<=m;


    }}
