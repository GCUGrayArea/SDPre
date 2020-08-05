import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    
    int userNum = kb.nextInt();

    if(userNum % 2 == 1) {
      System.out.println("The number is odd");
    } else {
      System.out.println("The number is even");
    }

    kb.close();
  }
}
