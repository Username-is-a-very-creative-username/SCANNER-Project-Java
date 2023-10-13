import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Your Numbers");
    
    int num1 = reader.nextInt();
    int num2 = reader.nextInt();

    if (num1>num2)
    {
    System.out.println((num1 + " is bigger"));
   }
    else
      {
      System.out.println((num2 + " is bigger"));
      }
    if (num1==num2)
    {
      System.out.println("Both of these numbers are also equal");
    }
    
      reader.close();
    }
  }
