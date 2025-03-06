//multilevel

class A
{
 void display()
 {
   System.out.println("This is class A");
 }
}

class B extends A
{
 void display()
 {
   super.display();
   System.out.println("This is class B");
 }
}

class C extends B
{
 void display()
 {
  super.display();
   System.out.println("This is class C");
 }
}
  


class minher
{
 public static void main(String[] args)
 {
   C obj=new C();
   obj.display();
 }
}
