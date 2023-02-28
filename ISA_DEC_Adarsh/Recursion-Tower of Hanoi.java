import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int disks=s.nextInt();

  int count=f(disks,"T1","T3","T2");
     System.out.print(count);
    }
    public static int f(int disks, String source, String auxilary,String destination){
        if(disks==0)
        return 0;
           
      int a= f(disks-1,source,destination,auxilary);
           System.out.println( "Move "+ disks +"th disc from "+source+ " to "+destination);
      int b= f(disks-1,auxilary,source,destination);
      return 1+a+b;

    }
}
