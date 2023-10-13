import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("What is the Programmers name (Mr_Sagha123)"); 
    String name1 = "Mehtab"; 
    String name2 = reader.nextLine();
    
    if(name1.equals(name2))
    {
      System.out.println("The name is the same as the programmer"); 
    }
    else 
    {
      System.out.println("This name is different than the programmer");
    }
    
   reader.close();
    
  }
}
