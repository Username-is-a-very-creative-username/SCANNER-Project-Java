import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Your Prefered Language: E = English, C = Chinese, S = Swedish, Sp = Spanish, P = Portugese, A = Arabic and F = French");
    String language = reader.nextLine();

    switch (language) {
      case "E":
    System.out.println("Hello!, How are you today");
    break;

    case "C":
      System.out.println("你好，你今天过得怎么样，希望你过得愉快");
    break;

    case "S":
      System.out.println("hej hur är din dag idag, jag hoppas den är fantastisk");
    break; 

      case "Sp":
      System.out.println("Hola como esta tu dia hoy");
    break;

      case "P":
      System.out.println("Olá, como está seu dia hoje");
    break;

    case "A":
          System.out.println("مرحبًا، كيف حال يومك اليوم، أتمنى أن يكون رائعًا");
        break;

      case "F":
          System.out.println("Bonjour comment allez-vous");
        break;

      default:
      System.out.println("Hey, we apologize we do not have this language available");
    break;
    }
        reader.close();
}
}
