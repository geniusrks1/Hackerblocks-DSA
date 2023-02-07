import java.util.*;
public class Main {
    public static void main(String args[]) {

Scanner s=new Scanner(System.in);
int row=s.nextInt();
int col=s.nextInt();
int matrix[][]=new int[row][col];
for(int i=0;i<row;i++){
	for(int j=0;j<col;j++){
		matrix[i][j]=s.nextInt();
	}
}




		int noe=row*col;
		int count=0;
		int rowstart=0;    
		int colstart=0;
		while(count!=noe){
		for(int i=rowstart;i<noe&& i<row;i++){
				System.out.print(matrix[i][colstart]+", ");
				count++;
			}
			colstart++;	

        for(int i=colstart;count<noe&&i<col;i++){
				System.out.print(matrix[row-1][i]+", ");
				count++;
			}
			row--;


	   for(int i=row-1; count<noe&&i>=rowstart;i--)	{
				System.out.print(matrix[i][col-1]+", ");
				count++;
			}
		col--;

			

			for(int i=col-1;count<noe &&i>=colstart;i--){
				System.out.print(matrix[rowstart][i]+", ");
				count++;
			}

rowstart++;
		}
	System.out.print("END");

    }
}
Close
