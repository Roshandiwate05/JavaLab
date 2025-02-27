//sum of all digits in number

class dsum
{
  public static void main(String args[])
  { 
    int num = 251025;
    int sum = 0, r;
    
   while(num > 0)
    {
    r = num % 10;
    sum = sum + r;
    num = num / 10;
    }
    
    System.out.println("The sum of all digits in 251025 is: " + sum);
  }
}