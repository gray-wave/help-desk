/*
|
|  >>>   UNDER CONSTRUCTION   <<<
|
*/
import java.util.Scanner;
public class SimpleDecision{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter two integer numbers: ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    if (num1 == num2) {
      System.out.printf("%d%s%d%n", num1, " is the same as ", num2);
        }
    if (num1 < num2) {
      System.out.printf("%d%s%d%n", num1, " is less than ", num2);
    }
    if (num1 > num2) {
      System.out.printf("%d%s%d%n", num1, " is greater than", num2);
    }
  }
} 
