import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){	
				long n=s.nextLong();
				int k=s.nextInt();
				long start=1;
				long end=n;
				long ans=1;
				while(start<=end){
					long mid=(start+end)/2;
					if(Math.pow(mid,k)<=n){
                     ans=mid;
					 start=mid+1;
					}
					else
					end=mid-1;
				}
				System.out.println(ans);
		}
    }
}
