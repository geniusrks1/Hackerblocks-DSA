import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long arrx[]=new long[n];
		long arry[]=new long[n];
	

		for(int i=0;i<n;i++){
			arrx[i]=s.nextLong();
			arry[i]=s.nextLong();
		}
Arrays.sort(arrx);
Arrays.sort(arry);

long dx=0;
long dy=0;
for(int i=1;i<n;i++){
  long diffx=arrx[i]-arrx[i-1]-1;
  long diffy=arry[i]-arry[i-1]-1;
  dx=Math.max(dx,diffx);
  dy=Math.max(dy,diffy);
}  


long area=dx*dy;
System.out.print(area);
  }
}
