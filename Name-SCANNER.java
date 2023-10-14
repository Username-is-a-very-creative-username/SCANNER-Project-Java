*import java.util.Scanner; //Adds the scanner into the code

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //Creates a new scanner
    System.out.println("What is the Programmers name (Mr_Sagha123)"); //Lets the Viewer see the question of the programmers name
    String name1 = "Mehtab"; //Makes the name of the programmer "Mehtab"
    String name2 = reader.nextLine(); //Makes the viewers input into a string
    
    if(name1.equals(name2))
    {
      System.out.println("The name is the same as the programmer"); //If the Viewers input matches the name of the programmer, print out that it's the same
    }
    else 
    {
      System.out.println("This name is different than the programmer"); //If the viewers input is different from the actual name, print out that its different
    }
    
   reader.close(); //Stops the scanner from reading anymore
    
  }
}
