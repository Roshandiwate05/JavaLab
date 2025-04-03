// Exception Handling using throw statement

public class Throw
{
  static void checkAge(int Age)
  {
    if(Age>18)
    {
      throw new ArithmeticException("Access Denied.");
    }
    
    else
    {
      System.out.println("Access Granted - You are old Enough.");
    }
  }
  


  public static void main(String args[])
  {
    checkAge(19);
  }

}
