import java.util.Scanner; //Adds the scanner into the code

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //Creates a new scanner class
    System.out.println("Player 1: Enter Rock, Paper or Scissors ");  //Lets player1 know its they're turn to pick Rock, Paper or Scissors
    String Player1 = reader.nextLine();  //Allows player1 the ability to pick an input
    System.out.println("Player 2: Enter Rock, Paper or Scissors ");  //Lets player2 know its they're turn to pick Rock, Paper or Scissors
    String Player2 = reader.nextLine(); //Allows player2 the ability to pick an input
    
  if (Player1.equals("Rock"))
  { 
      if (Player2.equals("Paper"))
      {
          System.out.println("Player 2 WINS");
      }
      else if (Player2.equals("Rock")) //If Player1 uses "Rock", Player2 "Looses" with "Scissors", "Ties" with "Rock" and "Wins" with "Paper" (Losses, Ties, and Wins Get Printed for the Viewer) 
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
      else if (Player2.equals("Rock")) //If Player1 uses "Paper", Player2 "Looses" with "Rock", "Ties" with "Paper" and "Wins" with "Scissors" (Losses, Ties, and Wins Get Printed for the Viewer) 
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
      else if (Player2.equals("Rock")) //If Player1 uses "Scissors", Player2 "Looses" with "Paper", "Ties" with "Scissors" and "Wins" with "Rock" (Losses, Ties, and Wins Get Printed for the Viewer) 
      {
          System.out.println("Player 2 WINS");
      }
      else if (Player2.equals("Scissors"))
      {
          System.out.println("Tie");
      }
  }
    reader.close(); //Stops the Scanner from reading anymore
}
}
