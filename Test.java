import java.util.Scanner;
class Student
{
private String name;
private int marks;
public void setDetails (String n,int m)
{
name=n;
marks=m;
}
public void printDetails(){
System.out.println("Name:"+name);
System.out.println("Marks:"+marks);
}
}
class Test{
public static void main(String[]args){
//declaring array of objects
Student[] st= new Student[5];
    //initiazing array
Scanner s=new Scanner(System.in);

for( int i=0;i<2;i++){
st[i].printDetails();
}
}
}