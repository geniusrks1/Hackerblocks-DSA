import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
	   String str=s.next();
	   System.out.print(checkAB(str));
    }

	public static boolean checkAB(String input) {
        int n=input.length();

        if(n==0)
            return true;
		else if(n==1 && input.equals("a"))
            return true;
        
            else if(input.substring(0,2).equals("aa"))
            return checkAB(input.substring(1));

            else if (n>2 && input.substring(0,3).equals("abb"))
            return checkAB(input.substring(3));

         else                 
        return false;

	}
}
