import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[]=new int[n];
	   int max=0;
	   for(int i=0;i<n;i++){
	   arr[i]=s.nextInt();
	   if(arr[i]>max)
	   max=arr[i];
	   }

int freq[]=new int[max+1];
for(int i=0;i<n;i++)
freq[arr[i]]++;

for(int i=0;i<max+1;i++){
	if(freq[i]!=0){
		while(freq[i]-->0){
			System.out.print(i+" ");
		}
	}
}

    }
}
