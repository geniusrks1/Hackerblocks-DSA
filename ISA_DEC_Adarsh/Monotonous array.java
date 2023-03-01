import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
       
       if(isMonotonic(arr))
       System.out.print("True");
       else
       System.out.print("False");
       
    }

public static boolean isMonotonic(int[] arr) {
        int n=arr.length;
        if(n<3)
        return true;
        boolean isdec=true;
        boolean isinc=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                if(i==0){
                    isdec=true;
                    isinc=true;
                }
                else{
                   if(isdec && isinc)
                     continue;
                   if(isinc)
                   isdec=false;
                   else
                   isinc=false;
                }
            }
            else if(arr[i]<arr[i+1]){
                if(i==0){
                    isinc=true;
                    isdec=false;
                }
                else{
                    if(isinc)
                     isdec=false;
                     else
                     return false;
                }

            }
            else{
                if(i==0){
                    isdec=true;
                    isinc=false;
                }
                else{
                    if(isdec){
                        isinc=false;
                    }
                    else
                    return false;
                }

            }
        }
        
        if((isinc && !isdec) || (!isinc && isdec) ||(isdec && isinc))
        return true;
    
return false;


    }
}
