// Exception Handling using throws keyword

import java.io.IOException;
class Throws
{
   void m() throws IOException
   {
     throw new IOException("Device Error.");
   }
   
   void n() throws IOException
   {
     m();
   }
   
   void p()
   {
     try
     {
       n();
     }
      
     catch(IOException e)
     {
       System.out.println("Exception Handle.");
     }
    }
    
    public static void main(String args[])
    {
      Throws obj = new Throws();
      obj.p();
      
      System.out.println("Normal Flow.");
    }
}
