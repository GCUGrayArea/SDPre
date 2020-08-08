import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while ( true ) {
      printMenu();
      selection = scanner.nextInt();

      if ( selection == 1 ) {
          sayHello();
      } else if ( selection == 2 ) {
          favoriteFoods();
      } else if ( selection == 3 ) {
          System.out.println( "Goodbye" );
          break;
      } else {
          System.out.println( "Invalid input" );
      }
    }

    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static void sayHello() {
    System.out.println("Hello Human");
  }

  public static void favoriteFoods() {
    System.out.println( "Apples, Bananas, Coconuts" );
  }
}
