//program to demonstrate dynamic intialization of 2d array
class ArrayDemoOne
{
     static public void main(String [] args)
     {
      int n[][]={{1,2,3,},{1,3,4,5},{2,5},{1,2,5}};
      System.out.println(n.length);  //4:number of rows

      System.out.println(n[0].length);//3:size of 1st row
      System.out.println(n[1].length);//4:size of 2nd row
      System.out.println(n[2].length);//2:size of 3rd row
      System.out.println(n[3].length);//3:size of 4th row
     }
}