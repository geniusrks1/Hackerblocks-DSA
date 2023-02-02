import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner s=new Scanner(System.in);
int start=s.nextInt();
int end=s.nextInt();
int step=s.nextInt();

while(start<=end){
	int C = 5*(start-32)/9;
System.out.println(start+"   "+C);
start+=step;
}

    }
}
