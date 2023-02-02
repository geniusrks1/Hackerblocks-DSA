import java.util.*;
public class Main {
    public static void main(String args[]) {
			Scanner s= new Scanner(System.in);
		      int num=s.nextInt();
			  int n=numberofDigits(num);
			  int sum=0;
			  int temp=num;
			  while(num!=0){
				  int d=num%10;
				  sum+=Math.pow(d,n);
				  num/=10;
			  }

			 if(sum==temp){
				 System.out.print(true);
			 }
			 else
			 System.out.print(false);


    }
	public static int numberofDigits(int n){
		int count=0;
		while(n!=0){
			count++;
			n/=10;
		}
		return count;
	}
}
