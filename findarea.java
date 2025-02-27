class Rectangle
{
    int area,length,breadth;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void getarea()
    {
        area=length*breadth;
        System.out.println("Area of Rectangle:"+area);
    }
}
public class findarea
{
    public static void main(String args[])
    {
        Rectangle rs=new Rectangle(10,20);
        rs.getarea();
    }
}