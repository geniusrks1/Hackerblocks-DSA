import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(); // number of students
		long m= s.nextLong(); // number of discount coupens
		long x=s.nextLong(); // minimum coupens require to get 100% discount
		long y=s.nextLong();//  a student not getting 100% discount will pay y coupens

/*
let a=number of student getting discount;
let b= number of student not getting discount;
total student n=a+b;
b number of student not getting discount so they will pay b*y coupens
total number of coupens became= m+by
x coupen require to get 100% for 1 student
then ax coupen require for a student to get 100% discount

ax=m+by
ax=m+(n-a)y
ax=m+ny-ay
a=m+ny/x+y;
*/

long ans=(m+n*y)/(x+y);
System.out.println(ans);



    }
}
