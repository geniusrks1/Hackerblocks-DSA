import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
	  int n=s.nextInt();

	  int rev=0;
	  while(n!=0){
		  int lastdigit=n%10;
		  rev=rev*10+lastdigit;
		  n/=10;
	  }
	  System.out.print(rev);
    }
}
