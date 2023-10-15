//Took 2 days on this program alone to learn and put this extra piece of effort together Hope Your Impressed ;) 
import java.util.Random; //Adds the Random class to the program
import java.util.Scanner; //Adds Scanner to the program

class Main {
  static Random rand = new Random(); //Makes a Random class
  static Scanner input = new Scanner(System.in); //Makes a Scanner class

  
  //stores different arthimetics for computer to choose an output to the viewer, as well as it to be labeled differently for the user to recgonize them easier.  
  static String symbols[] = {"x", "divided by", "+", "-"};

  //Allows the quizz to be become enabled or disabled 
  static boolean startGame = true;

  //counts failed and right attempts during the quiz
  static int failedAttempt = 0, rightAttempts = 0;
  static int answer = 0; //stores the answer in the program 
  public static void main(String[] args) {
  
    System.out.println("Answer the 3 Questions Correctly (NO DECIMALS ALLOWED)"); //lets the programmer know to answer the questions correctly 

    //Starts the quizz 
    while(startGame) {

      //generates numbers assigned to arthimetics to randomly pick
      int randSymbol = rand.nextInt(0, 4);

      //generates two randomized numbers to calculate
      int numberOne = rand.nextInt(1, 2000);
      int numberTwo = rand.nextInt(1, 2000);

      //if "randSymbol" interger picks 0 it will Multiply both randomized
      if(randSymbol == 0) {
        answer = numberOne * numberTwo;

        //if "randSymbol" interger picks 1 it will divide both randomized numbers
    } else if(randSymbol == 1 && numberOne < numberTwo) {//Makes sure that whichever randomized number is larger isn't placed first inorder to prevent negative Division. 
      
        int empty = numberOne;
        numberOne = numberTwo;
        numberTwo = empty;
        
        answer = numberOne / numberTwo;

        //if randSymbol interger picks 1 it will divide both randomized numbers
        //makes sure that it doesnt skip a correct question format()
    } else if(randSymbol == 1 && numberOne > numberTwo) {

        answer = numberOne / numberTwo;
        
      //if the "randomSymbol" integer picks 2 it will add both randomized number 
    } else if(randSymbol == 2) {
        answer = numberOne + numberTwo;
        
    } else if(randSymbol == 3 && numberOne < numberTwo) {  //Makes sure that whichever randomized number is larger isn't placed first inorder to prevent negative Subtraction. 

        int empty = numberOne;
        numberOne = numberTwo;
        numberTwo = empty;
      
        answer = numberOne - numberTwo;
        //if the "randomSymbol" integer picks 3 it will subtract both randomized numbers
    }  else if(randSymbol == 3 && numberOne > numberTwo) {

          answer = numberOne - numberTwo;
        
      }

        System.out.println();//Stylistic Choice (Optional) to add a space between the two texts to make the program more pretty
        System.out.println(numberOne + " " +               symbols[randSymbol] + " " + numberTwo); //Creates the structure of the question by adding the first Randomized number to the randomized symbol to the second randomized number
    
        System.out.println();

      int user_input = input.nextInt(); //Allows the "Secret Answer" to be input-able by the user

      //secret code for debugging reasons (Making certain equations easier to find and test)
        if(user_input == 433730) {
         System.out.println("SECRET A N S W E R: " + answer); 
           System.out.println("Secret SKIP Code Successfully Found!"); 
//Activates a "secret answer" allowing the user to easily skip a question 
      } else if(user_input == answer) { 
        System.out.println("Correct!"); //If The users input is equvilent to the "answer" they will get the question correct.  
        rightAttempts += 1;
        
      }  else if (user_input != answer){
        System.out.println("Incorrect!"); //If the users input does not match the "answer" they will get the qusetion wrong. 

        System.out.println("Correct answer: " + answer);
        failedAttempt += 1;
        
      }

      if(rightAttempts == 3) {
        System.out.println("Excellent, You did GREAT!"); //if the user gets all three questions correct they win the quiz
        startGame = false;
        
      }  else if(failedAttempt == 1) {
        System.out.println("GAME OVER"); //if the user gets one question wrong out of the 3 questions they will loose and the quiz will end
         startGame = false;
      }

    } 
  }  
}
