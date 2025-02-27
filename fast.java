// How we write fast code. (a = a % 10 || a %= 10)


class fast
{
  public static void main(String args[])
  {
    int a = 150;
    
    a %= 4;
    
    System.out.println("The remainder is: " + a);
  }
}