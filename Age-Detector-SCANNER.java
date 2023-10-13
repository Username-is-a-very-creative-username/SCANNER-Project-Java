import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter your Age: ");
    int age = reader.nextInt();

    if (age < 13) {
      System.out.println("You are a child");
    }
    if (age > 12 &&  age < 20) {
      System.out.println("You are a Teen");
    }
    if (age > 19 && age < 65) { 
      System.out.println("You are a adult");
    }
    if (age > 64) {
      System.out.println("You are an elder");
    }
    
    reader.close();
  }
}
