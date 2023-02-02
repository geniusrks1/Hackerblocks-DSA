import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s= new Scanner(System.in);
int t=s.nextInt();
while(t-->0){
	int bin=s.nextInt();
	int dec=0;
	int base=1;
	while(bin!=0){
		int lastDigit=bin%10;
		dec+=lastDigit*base;
		base*=2;
		bin/=10;
	}
System.out.println(dec);
}
    }
}
