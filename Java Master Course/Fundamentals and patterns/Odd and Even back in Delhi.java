import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		while(n-->0){
			int number=s.nextInt();
			int even_sum=0;
		    int odd_sum=0;
			while(number!=0){
				int lastdigit=number%10;
				if(lastdigit%2==0)
				even_sum+=lastdigit;
				else
				odd_sum+=lastdigit;
				number/=10;
			}
			if(odd_sum%3==0 || even_sum %4==0)
			System.out.println("Yes");
			else
			System.out.println("No");

		}

    }
}
