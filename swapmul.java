/* Write Java program for swapping two no's without using 3rd variable.
   Apply the logic of Multiplication and Division. */


   class swapmul
   {
     public static void main(String args[])
     {
       int a = 20;
       int b = 45;
       
       System.out.println("Before Swapping:\n\na = " + a + "\nb = " + b);
       
       a = a*b;
       b = a/b;
       a = a/b;
       
       System.out.println("\nAfter Swapping:\n\na = " + a + "\nb = " + b);
     }
   }