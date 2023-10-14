import java.util.Scanner; //Adds the scanner to the program

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //Makes a scanner class
    System.out.println("Enter Your Numbers"); //Tells the Programmer know to enter they're "numbers"
    
    int num1 = reader.nextInt(); //Lets the Programmer input they're first number 
    int num2 = reader.nextInt(); //Lets the programmer input they're second number

    if (num1>num2)
    {
    System.out.println((num1 + " is bigger")); //If the first number is bigger than the second number, print that the first number is bigger
   }
    else
      {
      System.out.println((num2 + " is bigger")); //If instead, the Second Number is bigger than the first Number, Print that the second number is bigger
      }
    if (num1==num2)
    {
      System.out.println("Both of these numbers are also equal"); //If both Numbers end up being equivalent also state that they are equal 
    }
    
      reader.close(); //Stops the scanner from reading anymore
    }
  }
