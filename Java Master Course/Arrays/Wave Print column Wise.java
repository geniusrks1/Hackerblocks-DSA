import java.util.*;
public class Main {
    public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	int mat[][]=new int[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			mat[i][j]=s.nextInt();
		}
	}


	for(int j=0;j<n;j++){
		for(int i=0;i<m;i++){
			if(j%2==0)
			System.out.print(mat[i][j]+", ");
			else
			System.out.print(mat[m-i-1][j]+", ");
		}
	}
	System.out.print("END");
}}
