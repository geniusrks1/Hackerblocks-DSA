import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner s=new Scanner(System.in);
   String str=s.next();
   int ans1=numberOfPermutation(str.length());
   System.out.println(ans1);
  
   ArrayList<String>ans=new ArrayList<>();
   allPermutations(str,0,str.length(),ans);
   Collections.sort(ans);
   for(String x:ans)
   System.out.print(x+" ");
//System.out.print(ans);
    }
	public static void allPermutations(String str, int idx,int n, ArrayList<String>ans){
		if(idx==n){
			ans.add(str);
			return;
		}
		for(int i=idx;i<n;i++){
			str=swap(str,idx,i);
			allPermutations(str,idx+1,n,ans);
			str=swap(str,idx,i);
		}
	}
public static int numberOfPermutation(int n){
	if(n==0)return 1;
	else return n*numberOfPermutation(n-1);
}
public static String swap(String str, int i, int j){
	char arr[]=str.toCharArray();
	char temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	//String ans=arr.toString();
	return String.valueOf(arr);

} 

}
