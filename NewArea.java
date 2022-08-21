

class NewArea

{
    public static double area(double r)
    {
         return(3.142*r*r);
    }
   //method with one parameters

    public static double area(double l,double b)
    {
         return(l*b);
     }
    //method with two parameters

   public static void main(String args[])
    {
      double c= area(1.2);  //area of circle
      double r= area (2.0,3.0);  //area of rectangle
    System.out.println("area of circle="+c);
     System.out.println("area of rectangle="+r);
     }
}