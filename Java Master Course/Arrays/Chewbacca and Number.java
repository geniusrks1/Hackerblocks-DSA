import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
	   long n=s.nextLong();
	   long ans=0;
	   long b=1;
	   while(n!=0){
		   long lastdigit=n%10;
		   if(lastdigit>=5 && n!=9)
		   lastdigit=9-lastdigit;
		   
		   ans=ans+lastdigit*b;
b*=10;
n/=10;
	   }
	   System.out.print(ans);
    }
}
