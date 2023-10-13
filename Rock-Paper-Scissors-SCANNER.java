import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Player 1: Enter Rock, Paper or Scissors ");  
    String Player1 = reader.nextLine();
    System.out.println("Player 2: Enter Rock, Paper or Scissors ");
    String Player2 = reader.nextLine();
    
  if (Player1.equals("Rock"))
  { 
      if (Player2.equals("Paper"))
      {
          System.out.println("Player 2 WINS");
      }
      else if (Player2.equals("Rock"))
      {
          System.out.println("Tie");
      }
      else if (Player2.equals("Scissors"))
      {
          System.out.println("Player 1 WINS");
      }
  }
   if (Player1.equals("Paper"))
  {
  if (Player2.equals("Paper"))
      {
          System.out.println("Tie");
      }
      else if (Player2.equals("Rock"))
      {
          System.out.println("Player 1 WINS");
      }
      else if (Player2.equals("Scissors"))
      {
          System.out.println("Player 2 WINS");
      }
  }
    if(Player1.equals("Scissors"))
    {
  if (Player2.equals("Paper"))
      {
          System.out.println("Player 1 WINS");
      }
      else if (Player2.equals("Rock"))
      {
          System.out.println("Player 2 WINS");
      }
      else if (Player2.equals("Scissors"))
      {
          System.out.println("Tie");
      }
  }
    reader.close();
}
}
