import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		long pre =s.nextLong();

		boolean isDec=true;
		
		while(n-->1){
             
             long curr =s.nextLong();

			if(pre>curr){
				if(isDec)
				pre=curr;
				else{
					System.out.print(false);
					return;
				}
				
			}
			else if(pre==curr){
				System.out.print(false);
					return;

			}
			else{
				isDec=false;
				pre=curr;
			}
		}
		System.out.print(true);

    }
}
