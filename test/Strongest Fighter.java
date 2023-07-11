import java.util.*;
public class Main {

	public static int findmax(int arr[], int s, int e){

			int max=Integer.MIN_VALUE;
			while(s<=e){
				if(max < arr[s]){
					max= arr[s];
				}
				s++;
			}
			return max;
	}

	public static ArrayList<Integer> f(int n, int arr[], int g){

		ArrayList<Integer> ans = new ArrayList<>();
		for(int i =0; i<n;i++){
			if(i+g-1>n-1){
			break;
			}
			int a1= findmax(arr, i, i+g-1);
			ans.add(a1);
		}

		return ans;
	}
    public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i =0; i<n; i++){
			arr[i]=s.nextInt();
		}
		int k= s.nextInt();

		ArrayList<Integer> ans= f(n, arr, k);
		
		for(int i =0;i< ans.size(); i++){
			System.out.print(ans.get(i)+" ");
		}

    }
}
