import java.util.*;
public class Main {
    public static void main (String args[]) {

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=s.nextInt();

int i=0;
int j=0;
while(i<n-1){
    if(arr[i]==arr[i+1]){
        i++;
    }
    else{
        arr[j]=arr[i];
        i++;
        j++;
    }
}
arr[j]=arr[n-1];

for(int k=0;k<=j;k++){
System.out.print(arr[k]+" ");
}

    }
}
