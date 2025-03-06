//Abstract

abstract class SYA
{
 abstract void display();
}
class Abstract extends SYA
{
 void display()
 {
  System.out.println("WELCOME");
 }
 public static void main(String[] args)
 {
  Abstract  obj=new Abstract();
  obj.display();
 }
}
