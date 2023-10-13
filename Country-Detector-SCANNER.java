import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Your Country: ");
    String Country = reader.nextLine();
    String message = " ";
    
    switch (Country) {
      case "Canada":
    message = "Hello!, Did you know canada was offically established in July 1st, 1867";
    break;
    
    case "Germany":
      message = "Hallo!, Did you know that germany was the country that causes WW1 and WW2";
    break;

    case "China":
      message = "你好!, Did you know China is the worlds largest producer of rice!";
    break; 

      case "Russia":
      message = "привет!, Did you know Russia as a country contains a total of 11 timezones";
    break;

      case "Spain":
      message = "Hola!, Did you know spain is known for having the most Romantic launage in the world";
    break;
    
      default:
      message = "Hi, Sorry I do not recognize this country";
    break;
    }
        System.out.println(message);
        reader.close();
}
}
