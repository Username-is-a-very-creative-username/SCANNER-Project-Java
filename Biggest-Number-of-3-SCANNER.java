import java.util.Scanner; //Adds the scanner to the code

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //Creates a scanner class
    System.out.println("Enter Your Numbers"); //Lets the Programmer know to Type out they're Numbers

    int num1 = reader.nextInt(); //Lets the Programmer input they're first number
    int num2 = reader.nextInt(); //Lets the Programmer input they're second number
    int num3 = reader.nextInt();  //Lets the Programmer input they're last number

    if (num1>num2 && num1>num3) {
      System.out.println(("The Largest Number is " + num1)); //If The First Number is bigger than the second and third one, than it is the biggest
    }
    else if (num2>num1 && num2>num3) {
      System.out.println(("The Largest Number is " + num2)); //If the Second Number is bigger than the First and Third one, than it is the biggest
    }
    else if (num3>num1 && num3>num2) { 
      System.out.println(("The Largest Number is " + num3)); //and If the third number is bigger than the First and Second One, than it is the biggest
    }

    reader.close();//Stops the scanner from reading anymore
  }
}
