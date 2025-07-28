// UNDER CONSTRUCTION
import java.util.Scanner;

public class ScannerExample{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);             // Instantiation of scanner class
    System.out.print("Enter an integer number: ");   // Prompting user via console
    int number1 = in.nextInt();                      // Using the instance of input object
    System.out.print("Enter an integer number: ");   // Prompting user via console
    int number2 = in.nextInt();                      // Using the instance of input object
    int sum = number1 + number2;                     // Math, yippie
    System.out.printf("%s%d%n","The sum of these two numbers is: ", sum);
  }
}
// Don't forget your closing brackets (:
