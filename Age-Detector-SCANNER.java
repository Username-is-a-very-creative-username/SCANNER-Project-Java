import java.util.Scanner; //Adds the scanner into the code 

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);//Makes a Scanner Class
    System.out.println("Enter your Age: "); //Lets the Programmer know to enter their age
    int age = reader.nextInt(); //makes the person's input to be viewed as their "Age" 

    if (age < 13) {
      System.out.println("You are a child"); //If Age is smaller than "13" Call the programmer a child
    }
    if (age > 12 &&  age < 20) {
      System.out.println("You are a Teen"); //If Age is older than "12" but younger than "20" Call the programmer a Teen
    }
    if (age > 19 && age < 65) { 
      System.out.println("You are a adult"); //If Age is older than "19" but younger than "65" Call the programmer an Adult
    }
    if (age > 64) {
      System.out.println("You are an elder"); //If Age is older than "64" Call the programmer an elder
    }
    
    reader.close(); //Stop the scanner from reading anymore 
  }
}
