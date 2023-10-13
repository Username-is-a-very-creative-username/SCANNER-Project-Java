import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Your Numbers");
    
    int num1 = reader.nextInt();
    int num2 = reader.nextInt();
    int num3 = reader.nextInt(); 

    if (num1<num2 && num1<num3) {
      System.out.println(("The Smallest Number is " + num1));
    }
    else if (num2<num1 && num2<num3) {
      System.out.println(("The Smallest Number is " + num2));
    }
    else if (num3<num1 && num3<num2) { 
      System.out.println(("The Smallest Number is " + num3));
    }

    reader.close();
  }
}
