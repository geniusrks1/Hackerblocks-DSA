import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ans="";
        int n=str.length();
        for(int i=0;i<n;i++){
            char chmix =str.charAt(i);
            char ch=chmix;
            if(chmix>='A' && chmix<='Z')
            ch= (char)(chmix-'A'+'a');
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y')
            continue;
            else
            ans+= "."+ch;
        }

System.out.print(ans);
    }
}
