public class osum {
    
}
// print sum of  odd nos between 1 to 100

class osum
{
  public static void main(String args[])
  {
    int i, sum=0;
    
    
    
    for(i=1; i<100; i++)
    {
     if(i%2!=0)
     {
      sum = sum + i;
      
    
      }
     
       
      }
      System.out.println("\nThe sum of all odd no between 1 to 100 is: " + sum);
  }
  }