import java.util.Scanner;

class details
{
  public static void main(String args[])
  {
    int rn;
    String name;
    String add;
    double income;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your Name: ");
    name = sc.nextLine();
    
    System.out.print("Enter your Address: ");
    add = sc.nextLine();
    
    System.out.print("Enter your Roll No.: ");
    rn = sc.nextInt();
    
    System.out.print("Enter your Expected Income: ");
    income = sc.nextDouble();
    
    
    
    
    System.out.println("\nMy name is " + name + ". \nMy Roll no is " + rn + ". \nMy Address is " + add + ". \nI Expect " + income + " LPA package.");
    
  }
  
}
    
    