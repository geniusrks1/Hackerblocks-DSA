import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
		int ans=count(n,d);
		System.out.print(ans);

    }
	public static int count(int n, int d){
		int count=0;
		while(n!=0){
			if(n%10 == d)
			count++;
			n/=10;
		}
		return count;
	}
}
