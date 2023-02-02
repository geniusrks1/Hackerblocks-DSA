import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();

		int d=(b*b)-(4*a*c);
		if(d==0){
			System.out.println("Real and Equal");
			System.out.println(-b/2*a +" "+ -b/2*a);
		}
		else if(d>0){
      System.out.println("Real and Distinct");
	  int x=(-b+(int)Math.sqrt(d))/(2*a);
	  int y=(-b-(int)Math.sqrt(d))/(2*a);
			System.out.println(Math.min(x,y) +" " +Math.max(x,y));
		}
		else
	  System.out.println("Imaginary");

    }
}
