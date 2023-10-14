import java.util.Scanner; //Adds the scanner to the code

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); //Makes a scanner class
    System.out.println("Enter Your Prefered Language: E = English, C = Chinese, S = Swedish, Sp = Spanish, P = Portugese, A = Arabic and F = French"); //Let the programmer know which Languages are available and how to input them
    String language = reader.nextLine();//Makes the programmers input to be viewed as they're "Language" 

    switch (language) {
      case "E":
    System.out.println("Hello!, How are you today"); //If the programmer selects English greet them in english 
    break;

    case "C":
      System.out.println("你好，你今天过得怎么样，希望你过得愉快"); //If the programmer selects chinese greet them in chinese 
    break;

    case "S":
      System.out.println("hej hur är din dag idag, jag hoppas den är fantastisk"); //If the programmer selects Swedish greet them in swedish 
    break; 

      case "Sp":
      System.out.println("Hola como esta tu dia hoy"); //If the programmer selects Spanish greet them in spanish 
    break;

      case "P":
      System.out.println("Olá, como está seu dia hoje"); //If the programmer selects Portuguese greet them in portuguese  
    break;

    case "A":
          System.out.println("مرحبًا، كيف حال يومك اليوم، أتمنى أن يكون رائعًا"); //If the programmer selects Arabic greet them in arabic  
        break;

      case "F":
          System.out.println("Bonjour comment allez-vous"); //If the programmer selects French greet them in French 
        break;

      default:
      System.out.println("Hey, we apologize we do not have this language available"); //If Language inputted isn't any of the available syntaxes apologize to the programmer 
    break;
    }
        reader.close(); //Stops the Scanner from reading anymore
}
}
