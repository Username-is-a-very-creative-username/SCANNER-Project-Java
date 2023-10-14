import java.util.Scanner; //Adds the Scanner to the Program

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //Creates a Scanner Class
    System.out.println("Enter Your Numbers"); //Lets the Programmer Know to input they're numbers
    
    int num1 = reader.nextInt(); //Lets the Programmer input they're 1st "Number"
    int num2 = reader.nextInt(); //Lets the Programmer input they're 2nd "Number"
    int num3 = reader.nextInt(); //Lets the Programmer input they're 3rd "Number"

    if (num1<num2 && num1<num3) {
      System.out.println(("The Smallest Number is " + num1)); //If The 1st Number is smaller than the 2nd and 3rd number, than it is the smallest
    }
    else if (num2<num1 && num2<num3) {
      System.out.println(("The Smallest Number is " + num2)); //If The 2nd Number is smaller than the 1st and 3rd number, than it is the smallest
    }
    else if (num3<num1 && num3<num2) { 
      System.out.println(("The Smallest Number is " + num3)); //If The 3rd Number is smaller than the 1st and 2nd number, than it is the smallest
    }

    reader.close(); //Stops the Scanner from reading
  }
}
