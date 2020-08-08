public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while( counter <= 20 ) {
      System.out.print( counter + " is " );
      switch( counter % 2 ) {
        case 0:
          System.out.println("even");
          break;
        default:
          System.out.println("odd");
          break;
      }
      counter++;
    }
  }
}
