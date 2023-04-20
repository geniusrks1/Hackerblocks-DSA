
import java.util.*;
class Main{

static ArrayList<String> lexNumbers(int n){
	ArrayList<String> s = new ArrayList<String>();

	for (int i = 1; i <= n; i++){
		s.add(String.valueOf(i));
	}

	Collections.sort(s); //nlogn
	return s;
}

public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();
	// metod1 store 1 to n number into arraylist in string form
	// then sort it and print 
	// tc nlogn
/*	ArrayList<String>  ans=lexNumbers(n); 
	System.out.print(0+" ");
	for(String i:ans)
	System.out.print(i+" "); */

// method 2 using dfs tc n efficient approach

	ArrayList<Integer>  ans= DFSlexNumbers(n);
	System.out.print(0+" ");
	for(Integer i:ans)
	System.out.print(i+" ");




}

    public static ArrayList<Integer> DFSlexNumbers(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(1, n, ans);
       return ans;
    }
 
    public static void dfs(int i, int n, ArrayList<Integer> ans){
        if (i > n)
            return;
        ans.add(i);
        dfs(i*10,n,ans);
        if (i%10 != 9)
            dfs(i+1, n, ans);
    }
}


