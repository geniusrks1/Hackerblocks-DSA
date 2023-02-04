import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();

		int mat[][]=new int[r][c];

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			mat[i][j]=s.nextInt();
		}
		int target=s.nextInt();

		for(int i=0;i<r;i++){
		    boolean ans=bSearch(mat,i,r,c, target);		
			if(ans){
				System.out.print(1);
				return;
			}
			
			}
			System.out.print(0);

    }
	public static boolean bSearch(int mat[][], int i, int r, int c, int target){
		int start=0;
		int end=c-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(mat[i][mid]>target)
			end=mid-1;
			else if(mat[i][mid]<target)
			start=mid+1;
			else
			return true;
		}
		return false;
	}
}
