// Parameterised Constructor

class Rectangle
{
  Rectangle(int l, int b)
  {
    length = l;
    breadth = b;
  }
  
  void getArea()
  {
    int area = length * breadth;
    System.out.println("Area of Rectangle: " + area);
  }
}

public class FindArea
{
  public static void main(String args[])
  {
    Rectangle rs = new Rectangle(10, 20);
    rs.getArea();
  }
}