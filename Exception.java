// Exception Handling

class Exception
{
  public static void main(String args[])
  {
    try
    {
      int a=10, b=0;
      int c;
      c=a/b;
    
      System.out.println("Result: " + c);
    }
    
    catch(ArithmeticException e)
    {
      System.out.println("Exception Caught. " + e.getMessage());
    }
    
    System.out.println("End of the program.");
    }
}