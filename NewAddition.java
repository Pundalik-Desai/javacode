class  NewAddition

{
     public static void main(String args[])
    {
              if (args.length==0)
              System.out.println("additon can not be done..");
              else 
              {
                float s=0.0f;
                for(int i=0;i<args.length;i++)
                {
                      s=s+Float.parseFloat(args[i]);
                }
                System.out.println("sum="+s);
              }
     }
}
