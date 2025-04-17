class M0 implements Runnable
{
 public void run()
 {
  System.out.println("Thread 0 is running...");
 }
}

class M1 implements Runnable
{
 public void run()
 {
  System.out.println("Thread 1 is running...");
 }
}
class m4
{
 public static void main(String args[])
 {
  M0 m0=new M0();
  Thread t0=new Thread(m0);
  t0.start();
  M1 m1=new M1();
  Thread t1=new Thread(m1);
  t1.start();
 }
}




