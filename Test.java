//Function Overloading

class Adder
{
  public int add(int a, int b)
  {
    return a+b;
  }
  
  public int add(int a, int b, int c)
  {
    return a+b+c;
  }
}     




class Test 
{
  public static void main(String args[])
  {
     
     Adder a = new Adder();
     int result1 = a.add(10, 20);
     System.out.println(result1);
     
    
      int result2 = a.add(10, 20, 30);
      System.out.println(result2);
   }
}