import java.util.*;
class Bikers
{
   
	public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
	double a,b,c,d,e;

	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	e=sc.nextInt();
	double avg =(double)(a+b+c+d+e)/5;
	System.out.println("average="+avg);
}
}
