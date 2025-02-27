class add
{
    int a,b,c,add;

    int add(int a,int b)
    {
        add=a+b;
        System.out.println(add);
        return a+b;
    }
    int add(int a,int b,int c)
    {
        add=a+b+c;
        System.out.println(add);
        return a+b+c;
    }
}

public class function
{
    public static void main(String args[])
    {
        add a=new add();
        a.add(20,30,40);
        a.add(20,30);
    }
}