import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		arr1[i]=s.nextInt();
		

		int m=s.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++)
		arr2[i]=s.nextInt();

int carry=0;
ArrayList<Integer> list=new ArrayList<>();
int i=n-1;
int j=m-1;
		while(i>=0 && j>=0){
         int sum=arr1[i]+arr2[j]+carry;
		 int lastdigit=sum%10;
		 carry=sum/10;
		 list.add(lastdigit);
		 i--;
		 j--;
		}
while(j>=0){
      int sum=arr2[j]+carry;
		 int lastdigit=sum%10;
		 carry=sum/10;
		 list.add(lastdigit);
		 j--;

}

while(i>=0){
      int sum=arr1[i]+carry;
		 int lastdigit=sum%10;
		 carry=sum/10;
		 list.add(lastdigit);
		 i--;

}
if(carry!=0)
list.add(carry);

int x=list.size();
for( int u=x-1;u>=0;u-- ){
	System.out.print(list.get(u)+", ");
}
System.out.print("END");

    }
}
