/* 
|  Here we have an example of importing
|  one of Java's built-in utilities. This
|  Scanner class has existed since JDK 8...
|  And for this course, we are using any JDK
|  beyond JDK 17. Again, JDK stands for 
|  "Java Development Kit." If you have already
|  taken Python, importing should be familiar.
|  By convention, we put our imports at the 
|  top of the file that utilizes them. The
|  process of importing in Java is known as
|  an "import declaration".
|
|  In order to accept input from the user,
|  we must first declare and assign our 
|  Scanner. That's right, Scanner is a datatype!
|  Like with all variables, we preface them with
|  the datatype followed by the variable name.
|  The textbook usually calls Scanner variables
|  "input," but I like to use "in" to save some
|  keystrokes.
|
|  The "System.in" part of the Scanner is known
|  as the standard input object. You can think
|  of this as the way of accessing stdin
|  via the Java language.
|  
|  UNDER CONSTRUCTION
|  
*/
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
