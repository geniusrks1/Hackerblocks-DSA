import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
boolean arr[]=new boolean[1000000];
arr[0]=true;
arr[1]=true;
for(int i=2;i*i<=1000000;i++){
	if(!arr[i]){
		for(int j=2*i;j<1000000;j+=i){
			
			arr[j]=true;
		}
	}
}

int n=s.nextInt();
while(n-->0){
	int a=s.nextInt();
	int b=s.nextInt();
	int count=0;
while(a<=b){
	if(!arr[a])
	count++;
	a++;
}
System.out.println(count);
}

    }
}
