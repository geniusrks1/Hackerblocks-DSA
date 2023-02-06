import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
            mat[i][j]=s.nextInt();
			}
		}
int matt[][]=new int[n][n];

          for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
          matt[j][i]=mat[i][n-j-1];
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
          System.out.print(matt[i][j]+" ");
			}
			System.out.println();
		}

    }
}
