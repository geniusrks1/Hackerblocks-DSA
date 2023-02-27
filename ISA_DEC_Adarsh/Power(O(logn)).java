import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int ans=f(n,p);
		System.out.print(ans);
    }



public static int f(int n, int p){
	if(p==0)
	return 1;
	else if(p%2==0)
	return f(n,p/2)*f(n,p/2);
	else 
	return n*f(n,p/2)*f(n,p/2);
	

	}
}
