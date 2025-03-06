//hir

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

class C extends A
{
 void display1()
 {
  
   System.out.println("This is class C");
 }
}



class hinher
{
 public static void main(String[] args)
 {
   B obj=new B();
   obj.display();
   C o=new C();
   o.display1();

 }
}
