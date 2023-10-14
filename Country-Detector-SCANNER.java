import java.util.Scanner; //Adds the scanner into the code

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //makes a scanner class
    System.out.println("Enter Your Country: "); //Lets the programmer know to enter their country
    String Country = reader.nextLine(); //Makes the programmer input to be viewed as a "Country" 
    String message = " "; //Stylistic Choice (Optional) to make an extra space between texts to make the programmer look more pretty looking 
    
    switch (Country) {
      case "Canada":
    message = "Hello!, Did you know canada was offically established in July 1st, 1867"; //If the user inputs "Canada" as they're country gives a mini trivia fact
    break;
    
    case "Germany":
      message = "Hallo!, Did you know that germany was the country that causes WW1 and WW2"; //If the user inputs "Germany" as they're country gives a mini trivia fact
    break;

    case "China":
      message = "你好!, Did you know China is the worlds largest producer of rice!"; //If the user inputs "China" as they're country gives a mini trivia fact
    break; 

      case "Russia":
      message = "привет!, Did you know Russia as a country contains a total of 11 timezones"; //If the user inputs "Russia" as they're country gives a mini trivia fact
    break;

      case "Spain":
      message = "Hola!, Did you know spain is known for having the most Romantic launage in the world"; //If the user inputs "Spain" as they're country gives a mini trivia fact
    break;
    
      default:
      message = "Hi, Sorry I do not recognize this country"; //Alternative to if the Country isn't recognized in the syntax, apologize to the programmer
    break;
    }
        System.out.println(message); //The stylistic choice is placed here
        reader.close(); //Stops the Scanner from reading 
}
}
