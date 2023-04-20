import java.util.*;
// public class Main {
// 	static ArrayList<String>ans=new ArrayList<>();
//     public static void main(String args[]) {
// 		Scanner s=new Scanner(System.in);
// 		int n=s.nextInt();
// 		while(n-->0){
// 			String str=s.next();
// 			 findsubsequences(str, 0,"");
// 			 Collections.sort(ans);
// 			// System.out.println(ans.size());
// 			 for(String x:ans)
//             System.out.println(x);
		
// 		}

//     }
// public static void findsubsequences(String str,int idx, String temp){
// 	if(idx==str.length()){
// 		ans.add(temp);
// 		return;
// 	}
// 	    String temp1=temp;
// 	    temp+= str.charAt(idx);

// 		findsubsequences(str, idx+1,temp1);
// 	    findsubsequences(str, idx+1, temp);
// }}

import java.util.*;
 
class Main {
 
    
    static void generate(TreeSet<String> st, String s){
        if (s.length() == 0)
            return;

      if (!st.contains(s)) 
            st.add(s);

        
 

            for (int i = 0; i < s.length(); i++) {
                String t = s;
                t = t.substring(0, i) + t.substring(i + 1);
                generate(st, t);
            }
        }
    
    
 
    // Driver code
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
        String s = sc.next();
        TreeSet<String> st = new TreeSet<>();
        generate(st, s);
        for (String str : st) {
            System.out.println(str);
        }
    }
}
}
