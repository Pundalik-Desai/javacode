import java.util.*;
class Salary
{
public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   int r,sal;
	 System.out.println("enter employ no");
r=sc.nextInt();
System.out.println("enter employe name");
String empname=sc.next();
System.out.println("enter your salary");
sal=sc.nextInt();
 double DA,HRA,PF,cca=240,pt=100;
 DA=sal*70/100;
 HRA=sal*30/100;
 PF=sal*10/100;
double gross_salry=sal+DA+HRA+cca;
double net_salry=(gross_salry-pt-PF);
System.out.println("Gross salary ="+gross_salry);
System.out.println("Net salary = "+net_salry);
}
} 


	