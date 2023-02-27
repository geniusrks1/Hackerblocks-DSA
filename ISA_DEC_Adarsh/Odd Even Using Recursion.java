import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  print(n);
    }
	public static void print(int n){
             if(n==0)
			 return ;

		if(n%2!=0){
			System.out.println(n);
				print(n-1);
		}
		else{
			print(n-1);
			System.out.println(n);
		}
		
	}
}
