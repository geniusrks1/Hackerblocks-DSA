import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t-->0){
int c1=s.nextInt();
int c2=s.nextInt();
int c3=s.nextInt();
int c4=s.nextInt();

int nr=s.nextInt();
int mc=s.nextInt();
int arrr[]=new int[nr];
int arrc[]=new int[mc];

for(int i=0;i<nr;i++)
arrr[i]=s.nextInt();

for(int i=0;i<mc;i++)
	arrc[i]=s.nextInt();

int total_costr=0;
int total_costc=0;
int temp_costr=0;
int temp_costc=0;
for(int i=0;i<nr;i++){
temp_costr += Math.min(c1*arrr[i],c2);
}
total_costr=Math.min(temp_costr,c3);

for(int i=0;i<mc;i++){
temp_costc += Math.min(c1*arrc[i],c2);
}
total_costc=Math.min(temp_costc,c3);

int Total_final_cost=Math.min(total_costc+total_costr,c4);
System.out.println(Total_final_cost);
    }
}
}
