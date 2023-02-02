import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int dec=0;
		int base=1;
		while(n!=0){
			int lastdigit=n%10;
			dec+=lastdigit*base;
			base*=2;
			n/=10;
		}
		System.out.print(dec);

    }
}
