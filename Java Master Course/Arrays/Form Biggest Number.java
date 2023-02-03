import java.util.*;


class String1 implements Comparable<String1>{
   String str;

   public String1(int str){
	   this.str=str+"";
   }

     public int compareTo(String1 o) {
			String str1=this.str;
			String str2=o.str;
            String x=str1+str2;
            String y=str2+str1;
			return y.compareTo(x);
		}
	}

public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
			int n=s.nextInt();
			String1 arr[]=new String1[n];
			        for(int i=0;i<n;i++)
	                arr[i]=new String1(s.nextInt());
				
              Arrays.sort(arr);
			 for(int i=0;i<n;i++)
			 System.out.print(arr[i].str);

			 System.out.println();
		}

    }
}
