import java.util.*;
public class Main {
    public static void main (String args[]) {

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();

int leftMax[]=new int[n];
int rightMin[]=new int[n];

leftMax[0]=arr[0];
for(int i=1;i<n;i++)
leftMax[i]=Math.max(leftMax[i-1],arr[i]);


rightMin[n-1]=Integer.MAX_VALUE;
for(int i=n-2;i>=0;i--){
rightMin[i]=Math.min(rightMin[i+1],arr[i+1]);
}

for(int i=0;i<n;i++){
if(leftMax[i] <=rightMin[i]){
    System.out.print(i+1);
return; 
 }
}
    }
}
