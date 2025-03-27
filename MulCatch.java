class MulCatch
{
  public static void main(String[] args)
  {
   try
   {
    int a[]=new int[5];
    a[5]=30/0;
   }
   catch(ArithmeticException e)
   {
    System.out.println("Arithmatic Exception Occurs");
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("ArrayIndexOutOfBoundsException Occurs");
   }
   catch(Exception e)
   {
    System.out.println("Parent Exception Occurs");
   }
   System.out.println("rest of the code");
  }
}
