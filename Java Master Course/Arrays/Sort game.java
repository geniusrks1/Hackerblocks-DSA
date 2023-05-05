import java.util.*;

class pair{
	int value;
	String name;
	public pair( String str ,int v){
		value=v;
		name=str;
	}

}
public class Main {
    public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
	   int k=s.nextInt();
	   int n=s.nextInt();
	   pair arr[]=new pair[n];
	   for(int i=0;i<n;i++){
  arr[i]=new pair(s.next(), s.nextInt());
	   }
	   

	   Arrays.sort(arr,new Comparator<pair>() {
            @Override
            public int compare(pair p1, pair p2) {
				if(p1.value<p2.value) return 1;
				else if(p1.value==p2.value){

					 if (p1.name.startsWith(p2.name)) 
                    return -1;
                 else if (p2.name.startsWith(p1.name)) 
                    return 1;
                else 
                    return p1.name.compareTo(p2.name);

				}
               else return -1;
                }
            });

for(int i=0;i<n;i++){
	if(arr[i].value >=k)
	System.out.println(arr[i].name +" "+ arr[i].value);
}

    }
}
