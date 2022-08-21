import java.io.*;
class CheckedExcaptionDemo
{
 public static void main(String args[]) throws IOException
   {
     DataInputStream din= new DataInputStream(System.in);
    String s=din.readLine();
    System.out.println(s);
   }
}    