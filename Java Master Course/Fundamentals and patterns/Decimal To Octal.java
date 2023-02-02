import java.util.*;
public class Main {
    public static void main(String args[]) {
       	Scanner s=new Scanner(System.in);
		int dec=s.nextInt();

       String oct="";

		while(dec!=0){
			oct=dec%8 + oct;
			dec/=8;
		}
     System.out.print(oct);
    }
}
